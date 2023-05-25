package com.atguigu.springcloud.service;

/**
 * @Author Liu
 * @Date 2023/5/24 - 0:18
 **/


public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String payment_Timeout(Integer id);
    String paymentCircuitBreaker(Integer id);
}

