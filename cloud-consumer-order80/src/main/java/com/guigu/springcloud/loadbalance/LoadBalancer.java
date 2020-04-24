package com.guigu.springcloud.loadbalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author xuanyiying
 * Created on 2020/3/18  23:24
 */
public interface LoadBalancer {
    /**
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
