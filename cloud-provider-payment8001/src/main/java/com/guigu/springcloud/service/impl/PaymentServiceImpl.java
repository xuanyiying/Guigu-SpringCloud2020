package com.guigu.springcloud.service.impl;

import com.guigu.springcloud.dao.PaymentDao;
import com.guigu.springcloud.entity.Payment;
import com.guigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuanyiying
 * Created on 2020/3/5  16:57
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.getById(id);
    }
}
