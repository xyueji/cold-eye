package com.xyueji.coldeye.netty.service;

import com.alibaba.fastjson.JSON;
import com.xyueji.coldeye.netty.common.SpringContextUtils;
import com.xyueji.coldeye.netty.entity.MessageEntity;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiongzhigang
 * @date 2021-01-25 16:42
 * @description 硬件报文处理, 数据报文:
 * SHT|HE00120931|29|76|1|null|null|20190802125717|SH5lb1.2.1R
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {
    private final static Logger log = LoggerFactory.getLogger(ServerHandler.class);

    public final static String MSG_TOPIC = "device_msg_topic";

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info("ServerHandler.channelRead(ctx, msg)");
        ByteBuf in = (ByteBuf) msg;
        try {
            if (in.readableBytes() <= 0) {
                return;
            }

            byte[] req = new byte[in.readableBytes()];
            in.readBytes(req);
            String body = new String(req, "UTF-8");
            log.info("报文内容：{}", body);

            // 解析报文
            MessageEntity message = this.parseMessage(body);
            String jsonMsg = JSON.toJSONString(message);
            log.info("报文解析结果为：{}", jsonMsg);

            // 发送至kafka
            KafkaSender kafkaSender = (KafkaSender) SpringContextUtils.getBean("kafkaSender");
            kafkaSender.send(MSG_TOPIC, jsonMsg);
            log.info("增加报文-仪表号：{}. 内容：{}.", message.getMetercode(), body);

            // 向硬件回送响应
            String responseText = "SHT|true|\0";
            ByteBuf buffer = ctx.alloc().buffer();
            buffer.writeBytes(responseText.getBytes());
            ctx.writeAndFlush(buffer);
            buffer.resetReaderIndex();

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        } finally {
            // 使用完ByteBuf之后，需主动释放资源。否则，资源一直在内存中加载，容易造成内存溢出
            ReferenceCountUtil.release(msg);
        }

        if (null != in) {
            // 把当前的写指针writerIndex恢复到之前保存的markedWriterIndex值
            in.resetReaderIndex();
        }
    }

    private MessageEntity parseMessage(String body) {
        String[] arrBody = body.split("\\|");
        log.info("报文字段数量：{}", arrBody.length);

        MessageEntity msg = new MessageEntity();
        msg.setMetercode(arrBody[1]);
        msg.setTem(Integer.valueOf(arrBody[2]));
        msg.setHum(Integer.valueOf(arrBody[3]));
        msg.setState(Integer.valueOf(arrBody[4]));
        msg.setLon(arrBody[5]);
        msg.setLat(arrBody[6]);
        msg.setCurtime(arrBody[7]);

        return msg;
    }
}
