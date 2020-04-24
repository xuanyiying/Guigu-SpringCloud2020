package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuanyiying
 * Created on 2020/3/18  19:48
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于使用consul 或者zookeeper 作为注册中心服务
public class OrderConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class, args);
    }
}
