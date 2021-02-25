package com.taylor.springcloud.controller;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import com.taylor.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/23 23:20
 */
@RestController
@Slf4j
public class PaymetController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/save")
    public ResponseCommon save(PaymentEntity paymentEntity){
        int result = paymentService.save(paymentEntity);
        log.info("插入返回结果 ："+result);
        if (result>0){
            return new ResponseCommon(200,"save success",result);
        }else {
            return new ResponseCommon(500,"save fail");
        }
    }
    @GetMapping (value = "/payment/get/{id}")
    public ResponseCommon getPaymentByID(@PathVariable("id") Long id){
        PaymentEntity result = paymentService.getPaymentByID(id);
        if (result!=null){
            return new ResponseCommon(200,"query success",result);
        }else {
            return new ResponseCommon(200,"no data");
        }
    }
}
