package com.taylor.springcloud.controller;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import com.taylor.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/save")
    public ResponseCommon save(@RequestBody PaymentEntity paymentEntity){
        int result = paymentService.save(paymentEntity);
        log.info("插入返回结果 ："+result+" ^_^ ");
        if (result>0){
            return new ResponseCommon(200,"success serverPort:"+serverPort,result);
        }else {
            return new ResponseCommon(500,"fail");
        }
    }
    @GetMapping (value = "/payment/get/{id}")
    public ResponseCommon<PaymentEntity> getPaymentByID(@PathVariable("id") Long id){
        PaymentEntity result = paymentService.getPaymentByID(id);
        log.info("查询返回结果 ："+result.toString()+" ^_^ ");
        if (result!=null){
            return new ResponseCommon(200,"success serverPort:"+serverPort,result);
        }else {
            return new ResponseCommon(200,"no data！");
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            // 暂停3秒钟
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    /**
     * 链路跟踪
     *
     * @return
     */
    @GetMapping(value = "/payment/zipkin")
    public String paymentZipkin() {
        return "hi,i'am paymentZipkin server fall back,welcome to springcloud ,O(∩_∩)O哈哈~";
    }
}
