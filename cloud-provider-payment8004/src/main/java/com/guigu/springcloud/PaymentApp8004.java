package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuanyiying
 * Created on 2020/3/9  18:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8004.class, args);
    }
}
