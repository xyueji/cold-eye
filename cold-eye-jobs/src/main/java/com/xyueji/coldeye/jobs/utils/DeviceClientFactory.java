package com.xyueji.coldeye.jobs.utils;

import com.xyueji.coldeye.common.netty.entity.MessageEntity;
import com.xyueji.coldeye.common.utils.YmlUtil;
import com.xyueji.coldeye.jobs.task.ClientDeviceHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author xiongzhigang
 * @date 2021-01-26 13:44
 * @description 向Netty服务器发送报文
 */
public class DeviceClientFactory {
    private final static Logger log = LoggerFactory.getLogger(DeviceClientFactory.class);

    private final static DeviceClientFactory client = new DeviceClientFactory();
    private final static DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static Channel channel;

    public static DeviceClientFactory getInstance() {
        return client;
    }

    /**
     * 向Netty服务器发送报文
     *
     * @param meterCode
     */
    public void sendDeviceMessage(String meterCode) {
        try {
            String msg = getRandomMsg(meterCode);
            log.info("{}发送报文, msg: {}", meterCode, msg);

            // 发送报文
            connect(msg);
        } catch (Exception e) {
            log.error("发送报文失败，msg: {}", e.getMessage());
        }
    }

    /**
     * 模拟硬件发送报文
     *
     * @param msg
     * @throws Exception
     */
    private void connect(final String msg) throws Exception {
        // 设置netty服务器的ip、端口
        String host = YmlUtil.getValue("netty.host").toString();
        int port = Integer.parseInt(YmlUtil.getValue("netty.port").toString());

        // 设置netty客户端主线程
        Bootstrap bootstrap = new Bootstrap();

        // 设置连接缓冲池
        NioEventLoopGroup group = new NioEventLoopGroup();

        // 配置客户端主线程参数
        bootstrap.group(group);
        // 通道的类型
        bootstrap.channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true);// 发送类型，非延迟

        // 执行程序
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast("decoder", new StringDecoder())
                        .addLast("encoder", new StringEncoder())
                        .addLast(new ClientDeviceHandler(msg));
            }
        });

        try {
            // 发起异步连接操作（异步连接服务器）
            ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
            channel = channelFuture.channel();
            // 异步等待关闭连接
            channel.closeFuture().sync();
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            group.shutdownGracefully();
        }
    }

    /**
     * 生成随机报文
     *
     * @param meterCode
     * @return
     */
    private String getRandomMsg(String meterCode) {
        MessageEntity message = new MessageEntity();
        message.setMetercode(meterCode);

        // 设置随机温度
        int maxTem = 100;
        int minTem = -100;
        message.setTem(getRandomNum(maxTem, minTem));

        // 设置随机湿度
        int maxHum = 100;
        int minHum = 0;
        message.setHum(getRandomNum(maxHum, minHum));

        // 设置随机状态
        message.setState(getRandomNum(100, 0) % 3);

        // 设置当前时间
        message.setCurtime(dateFormat.format(new Date()));

        return message.deviceMessage();
    }

    private int getRandomNum(int max, int min) {
        Random random = new Random();
        int diff = random.nextInt(max) % (max - min);

        return min + diff;
    }

    public static void main(String[] args) {
        DeviceClientFactory.getInstance().sendDeviceMessage("test");
    }
}
