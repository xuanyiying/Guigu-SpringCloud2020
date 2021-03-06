package com.guigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuanyiying
 * Created on 2020/3/5  21:29
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
   // @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
