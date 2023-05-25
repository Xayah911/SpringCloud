package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author Liu
 * @Date 2023/5/23 - 13:10
 **/



public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取
}

