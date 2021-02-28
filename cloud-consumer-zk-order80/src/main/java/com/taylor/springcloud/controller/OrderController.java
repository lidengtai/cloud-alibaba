package com.taylor.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/28 23:36
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL= "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        log.info("返回结果："+result);
        return result;
    }
}
