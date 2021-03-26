package com.taylor.springcloudalibaba.service;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/26 23:57
 */
@FeignClient(value = "nacos-payment-service",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/paymentSQL/{id}")
    ResponseCommon<PaymentEntity> paymentSQL(@PathVariable("id") Long id);
}
