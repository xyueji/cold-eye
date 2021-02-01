package com.xyueji.coldeye.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiongzhigang
 * @date 2021-02-01 16:00
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class DruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
    }
}
