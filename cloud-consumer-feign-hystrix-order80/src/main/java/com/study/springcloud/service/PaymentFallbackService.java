package com.study.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author TODO
 * @date 2021/8/24 10:33
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService  paymentInfo_OK------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService  paymentInfo_TimeOut------";
    }
}
