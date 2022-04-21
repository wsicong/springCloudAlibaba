package com.sc.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *@author 180609
 *@date 2022/4/20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.sc.cloud.pojo")
@MapperScan("com.sc.cloud.dao")
public class EngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EngineApplication.class);
    }
}
