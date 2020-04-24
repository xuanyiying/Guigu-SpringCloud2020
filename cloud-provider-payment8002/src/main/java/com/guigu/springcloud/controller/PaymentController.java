package com.guigu.springcloud.controller;

import com.guigu.springcloud.entity.CommonResult;
import com.guigu.springcloud.entity.Payment;
import com.guigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuanyiying
 * Created on 2020/3/5  17:30
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        return result > 0 ? new CommonResult<Integer>(200, "create payment successful, serverPort:" + serverPort, result) :
                new CommonResult<>(444, "insert payment failed", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable Long  id) {
        Payment payment = paymentService.getById(id);
        return payment != null ? new CommonResult<Payment>(200, "Get payment successful, serverPort:" + serverPort, payment) :
                new CommonResult<>(444, "Get payment failed", null);
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
