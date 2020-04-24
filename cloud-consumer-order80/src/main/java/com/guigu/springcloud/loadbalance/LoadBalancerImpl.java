package com.guigu.springcloud.loadbalance;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xuanyiying
 * Created on 2020/3/18  23:26
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current, next;
        do {
            current = atomicInteger.get();
            next = current >= 2147483647 ? 0 : atomicInteger.getAndIncrement();
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("***********第几次访问，次数next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        if (serviceInstances == null || serviceInstances.isEmpty()) {
            return null;
        }
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }

}
