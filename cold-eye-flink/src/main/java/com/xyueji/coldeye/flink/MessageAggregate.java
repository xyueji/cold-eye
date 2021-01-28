package com.xyueji.coldeye.flink;

import com.xyueji.coldeye.common.admin.entity.MeterEntity;
import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import com.xyueji.coldeye.common.utils.JedisUtil;
import com.xyueji.coldeye.common.utils.SerializeUtil;
import org.apache.flink.api.common.functions.MapFunction;
import redis.clients.jedis.Jedis;
import redis.clients.util.SafeEncoder;

/**
 * @author xiongzhigang
 * @date 2021-01-28 16:53
 * @description
 */
public class MessageAggregate implements MapFunction<MessageEntity, MessageEntity> {
    private final JedisUtil jedisUtil = JedisUtil.getInstance();
    @Override
    public MessageEntity map(MessageEntity messageEntity) throws Exception {
        Jedis jedis = jedisUtil.getJedis();
        try {
            byte[] meterBytes = jedis.get(SafeEncoder.encode(messageEntity.getMeterCode()));
            MeterEntity meterEntity = (MeterEntity) SerializeUtil.unserialize(meterBytes);
            messageEntity.setMeterId(meterEntity.getId());
            messageEntity.setMeterName(meterEntity.getMeterName());
            messageEntity.setHostCode(meterEntity.getHostCode());
            messageEntity.setHostId(meterEntity.getHostId());
            messageEntity.setHostName(meterEntity.getHostName());
            messageEntity.setHouseCode(meterEntity.getHouseCode());
            messageEntity.setHouseId(meterEntity.getHouseId());
            messageEntity.setHouseName(meterEntity.getHouseName());
            messageEntity.setCompanyId(meterEntity.getCompanyId());
            messageEntity.setCompanyName(meterEntity.getCompanyName());
            messageEntity.setMaxTem(meterEntity.getMaxTem());
            messageEntity.setMinTem(meterEntity.getMinTem());
            messageEntity.setMaxHum(meterEntity.getMaxHum());
            messageEntity.setMinHum(meterEntity.getMinHum());

            if (messageEntity.getTem() > messageEntity.getMaxTem()) {
                // 高温
                messageEntity.setTemAlert(1);
            } else if (messageEntity.getTem() < messageEntity.getMaxTem()) {
                // 低温
                messageEntity.setTemAlert(-1);
            } else {
                // 正常
                messageEntity.setTemAlert(0);
            }

            if (messageEntity.getHum() > messageEntity.getMaxHum()) {
                // 湿度过高
                messageEntity.setHumAlert(1);
            } else if (messageEntity.getHum() < messageEntity.getMaxHum()) {
                // 湿度过低
                messageEntity.setHumAlert(-1);
            } else {
                // 正常
                messageEntity.setHumAlert(0);
            }
        } catch (Exception e) {
            jedisUtil.returnBrokenResource(jedis);
            e.printStackTrace();
        } finally {
            jedisUtil.returnJedis(jedis);
        }
        return messageEntity;
    }
}
