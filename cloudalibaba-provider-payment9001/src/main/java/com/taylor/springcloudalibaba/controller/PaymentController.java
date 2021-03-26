package com.taylor.springcloudalibaba.controller;

import cn.hutool.core.util.IdUtil;
import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/19 23:41
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static Map<Long, PaymentEntity> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new PaymentEntity(1L, IdUtil.simpleUUID()));
        hashMap.put(2L, new PaymentEntity(2L, IdUtil.simpleUUID()));
        hashMap.put(3L, new PaymentEntity(3L, IdUtil.simpleUUID()));
    }

    @GetMapping("/paymentSQL/{id}")
    public ResponseCommon<PaymentEntity> paymentSQL(@PathVariable("id") Long id) {
        PaymentEntity payment = hashMap.get(id);
        return new ResponseCommon<>(200, "from mysql,serverPort:" + serverPort, payment);
    }

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos register, serverport=" + serverPort + "\t id:" + id;
    }
}