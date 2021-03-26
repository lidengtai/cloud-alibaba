package com.taylor.springcloudalibaba.controller;

import cn.hutool.core.util.IdUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import com.taylor.springcloudalibaba.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zzyy
 * @version 1.0
 * @create 2020/03/06
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public ResponseCommon byResource(){
        return new ResponseCommon(200, "按资源名称限流测试OK", new PaymentEntity(2020L, IdUtil.simpleUUID()));
    }

    public ResponseCommon handleException(BlockException blockException){
        return new ResponseCommon<>(444, blockException.getClass().getCanonicalName()+"\t服务不可用" );
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public ResponseCommon byUrl(){
        return new ResponseCommon(200, "by url限流测试OK", new PaymentEntity(2020L, IdUtil.simpleUUID()));
    }
    //CustomerBlockHandler

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
                    blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public ResponseCommon customerBlockHandler(){
        return new ResponseCommon(200, "客户自定义 限流测试OK", new PaymentEntity(2020L, IdUtil.simpleUUID()));
    }
}
