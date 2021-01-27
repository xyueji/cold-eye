package com.xyueji.coldeye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiongzhigang
 * @date 2021-01-26 10:45
 * @description 分布式任务
 */
@SpringBootApplication
@EnableEurekaClient
public class JobsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobsApplication.class, args);
    }
}
