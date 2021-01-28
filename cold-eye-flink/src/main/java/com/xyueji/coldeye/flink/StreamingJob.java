package com.xyueji.coldeye.flink;

import com.alibaba.fastjson.JSON;
import com.xyueji.coldeye.common.monitor.entity.MessageEntity;
import com.xyueji.coldeye.flink.utils.KafkaUtil;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.restartstrategy.RestartStrategies;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

/**
 * @author xiongzhigang
 * @date 2021-01-28 15:45
 * @description flink任务
 */
public class StreamingJob {
    private final static String FROM_TOPIC = "device_msg_topic";
    private final static String TO_TOPIC = "all_device_message";
    public static void main(String[] args) throws Exception {
        // 获取环境信息
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // 设置容错
        env.enableCheckpointing(5000);
        // 设置检查点模式
        env.getCheckpointConfig().setCheckpointingMode(CheckpointConfig.DEFAULT_MODE);
        // 设置重启策略
        env.getConfig().setRestartStrategy(RestartStrategies.fixedDelayRestart(4, 1000));
        FlinkKafkaConsumer<String> consumer = KafkaUtil.getInstance().getConsumer(FROM_TOPIC);
        consumer.setStartFromLatest();
        // 设置实时数据源：kafka队列
        SingleOutputStreamOperator<MessageEntity> stream = env.addSource(consumer)
                .setParallelism(1)
                .map(s -> JSON.parseObject(s, MessageEntity.class));
        // 从redis获取设备信息，合并至消息中
        SingleOutputStreamOperator<MessageEntity> outStream = stream.map(new MessageAggregate());
        // 存储设备指标信息
        outStream.addSink(new SinkToMysql());
        // 将消息发送到kafka队列
        // Druid监听此队列，将消息存储到druid当中
        FlinkKafkaProducer<String> producer = KafkaUtil.getInstance().getProducer(TO_TOPIC);
        outStream.map((MapFunction<MessageEntity, String>) JSON::toJSONString).addSink(producer);

        producer.close();
        env.execute("冷链设备实时监控任务");
    }
}
