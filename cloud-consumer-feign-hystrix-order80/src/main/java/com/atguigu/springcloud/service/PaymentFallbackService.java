package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author Liu
 * @Date 2023/5/24 - 1:59
 **/


@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String payment_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
