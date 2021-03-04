package com.taylor.springcloud.controller;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import com.taylor.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/4 22:59
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public ResponseCommon<PaymentEntity> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentByID(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
