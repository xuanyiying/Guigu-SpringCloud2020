package com.guigu.springcloud.dao;

import com.guigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author xuanyiying
 * Created on 2020/3/5  16:33
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getById(@Param("id") Long id);

}
