package com.guigu.springcloud.service;

import com.guigu.springcloud.entity.Payment;

/**
 * @author xuanyiying
 * Created on 2020/3/5  16:56
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getById(Long id);

}
