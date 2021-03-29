package com.taylor.springcloud.alibaba.controller;

import com.taylor.springcloud.alibaba.service.AccountService;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
@RequestMapping(value = "account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping(value = "decrease")
    public ResponseCommon decrease(@RequestParam("userId") Long userId,
                                   @RequestParam("money")BigDecimal money) {
        accountService.decrease(userId, money);
        return new ResponseCommon(200,"账户余额扣减成功，哈哈哈");
    }
}
