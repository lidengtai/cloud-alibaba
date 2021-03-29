package com.taylor.springcloud.alibaba.service;


import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    ResponseCommon decrease(@RequestParam("productId") Long productId,
                            @RequestParam("count") Integer count);
}
