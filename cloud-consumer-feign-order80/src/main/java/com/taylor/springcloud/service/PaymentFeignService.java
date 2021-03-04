package com.taylor.springcloud.service;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author taylor
 * @Description:
 * @date 2021/3/4 22:51
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public ResponseCommon<PaymentEntity> getPaymentByID(@PathVariable("id") Long id);

    /**
     * 模拟feign超时
     * 默认超时时间1秒 yml中配置自定义超时时间
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();

}
