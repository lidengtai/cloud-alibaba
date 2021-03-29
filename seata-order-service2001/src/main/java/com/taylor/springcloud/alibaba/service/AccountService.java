package com.taylor.springcloud.alibaba.service;

import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Component
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    ResponseCommon decrease(@RequestParam("userId") Long userId,
                            @RequestParam("money") BigDecimal money);
}
