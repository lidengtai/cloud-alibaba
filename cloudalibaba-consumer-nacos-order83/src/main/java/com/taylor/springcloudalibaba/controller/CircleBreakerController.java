package com.taylor.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import com.taylor.springcloudalibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/26 23:41
 */
@RestController
@Slf4j
public class CircleBreakerController {
    private static final String SERVICE_URL = "http://nacos-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback") //没有配置
//    @SentinelResource(value = "fallback",fallback = "handlerFallback") //配置了fallback的，fallback只负责业务异常
//    @SentinelResource(value = "fallback",blockHandler = "blockHandler") // 配置了blockHandler，只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback",fallback = "handlerFallback", blockHandler = "blockHandler",
            exceptionsToIgnore = {IllegalArgumentException.class}) // 配置了blockHandler和fallback
    public ResponseCommon<PaymentEntity> fallback(@PathVariable("id") Long id){
        ResponseCommon<PaymentEntity> ResponseCommon = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, ResponseCommon.class);
        if(id == 4){
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常");
        }else if(ResponseCommon.getData() == null){
            throw new NullPointerException("NullPointerException,该ID没有记录，空指针异常");
        }
        return ResponseCommon;
    }
    // 本例是fallback
    public ResponseCommon handlerFallback(Long id, Throwable e){
        PaymentEntity payment = new PaymentEntity(id, null);
        return new ResponseCommon(444, "兜底异常handler，exception内容"+e.getMessage(), payment);
    }

    public ResponseCommon blockHandler(Long id, BlockException exception){
        PaymentEntity payment = new PaymentEntity(id, null);
        return new ResponseCommon<>(445, "blockHandler-sentinel 限流，无此流水号：blockException" + exception.getMessage(), payment);
    }

    // --------------- open feign---------

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/openfeign/{id}")
    public ResponseCommon<PaymentEntity> paymentSQL(@PathVariable("id") Long id){
        return paymentService.paymentSQL(id);
    }
}
