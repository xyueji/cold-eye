package com.xyueji.coldeye.netty.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xiongzhigang
 * @date 2021-01-25 16:56
 * @description
 */
@Component
public class KafkaSender {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean send(String topic, String msg) {
        try {
            kafkaTemplate.send(topic, msg);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
