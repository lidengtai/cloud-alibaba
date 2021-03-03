package com.taylor.spirngcloud.controller;


import com.taylor.spirngcloud.loadbalance.MyLoadBalanced;
import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/25 23:04
 */
@RestController
@Slf4j
public class OrderController {

    //单机版
//    public static final String PAYMENT_URL="http://localhost:8001/payment";
    //集群版
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE/payment";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private MyLoadBalanced loadBalanced;

    @Resource
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public ResponseCommon<PaymentEntity> getPayment2(@PathVariable("id") long id){
        log.info("消费端调用查询接口");
        ResponseEntity<ResponseCommon> forEntity = restTemplate.getForEntity(PAYMENT_URL + "/get/" + id, ResponseCommon.class);
        if (forEntity.getStatusCode().is2xxSuccessful()) {
            return forEntity.getBody();
        }else {
            return new ResponseCommon(500,"fail");
        }
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        ServiceInstance serviceInstance = loadBalanced.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb",String.class);
    }
}
