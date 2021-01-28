package com.xyueji.coldeye.flink.utils;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.util.Properties;

/**
 * @author xiongzhigang
 * @date 2021-01-28 16:21
 * @description
 */
public class KafkaUtil {
    private static volatile KafkaUtil instance = null;
    private static Properties properties = null;

    static {
        //kafka队列属性
        properties = new Properties();
        properties.setProperty("bootstrap.servers", "cold.eye.com:9092");
        properties.setProperty("group.id", "coldflink");
        properties.setProperty("auto.offset.reset", "earliest");
    }

    private KafkaUtil() {

    }

    public static KafkaUtil getInstance() {
        if (instance == null) {
            synchronized (KafkaUtil.class) {
                if (instance == null) {
                    instance = new KafkaUtil();
                }
            }
        }

        return instance;
    }

    public FlinkKafkaConsumer<String> getConsumer(String topic) {
        return new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), properties);
    }

    public FlinkKafkaProducer<String> getProducer(String topic) {
        return new FlinkKafkaProducer<>(topic, new SimpleStringSchema(), properties);
    }
}
