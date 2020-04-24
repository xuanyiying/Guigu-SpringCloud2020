package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuanyiying
 * Created on 2020/3/18  18:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006Main.class, args);
    }
}
