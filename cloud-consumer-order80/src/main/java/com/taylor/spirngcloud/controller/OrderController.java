package com.taylor.spirngcloud.controller;

import com.taylor.spirngcloud.entities.PaymentEntity;
import com.taylor.spirngcloud.entities.ResponseCommon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/25 23:04
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL="http://localhost:8001/payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get/{id}")
    public ResponseCommon<PaymentEntity> getPayment(@PathVariable("id") long id){
        log.info("消费端调用查询接口");
        return restTemplate.getForObject(PAYMENT_URL+"/get/"+id,ResponseCommon.class);
    }

    @GetMapping("/consumer/payment/save")
    public ResponseCommon<PaymentEntity> save(PaymentEntity paymentEntity){
        log.info("消费端调用插入接口");
        return restTemplate.postForObject(PAYMENT_URL+"/save",paymentEntity,ResponseCommon.class);
    }
}
