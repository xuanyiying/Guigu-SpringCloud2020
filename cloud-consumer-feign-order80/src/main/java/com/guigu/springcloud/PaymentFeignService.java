package com.guigu.springcloud;

import com.guigu.springcloud.entity.Payment;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author xuanyiying
 * Created on 2020/3/19  14:57
 */
@Component
@FeignClient
public interface PaymentFeignService {
    int create(Payment payment);
    Payment getById(Long id);
}
