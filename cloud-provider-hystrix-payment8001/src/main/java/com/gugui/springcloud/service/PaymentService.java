package com.gugui.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xuanyiying
 * Created on 2020/4/23  15:08
 */
@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_OK,id" + id + "\t" + "哈哈哈~";
    }

    @HystrixCommand
    public String paymentInfo_TimeOut(Integer id) {
        int time = 3;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_TimeOut,id" + id + "\t" + "哈哈哈~" + "耗时（秒）：" + time;
    }
}
