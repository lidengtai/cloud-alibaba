package com.taylor.springcloud.alibaba.controller;

import com.taylor.springcloud.alibaba.service.StorageService;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/storage")
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping(value = "/decrease")
    public ResponseCommon decrease(@RequestParam("productId") Long productId,
                                   @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new ResponseCommon(200,"库存扣减成功，哈哈哈哈");
    }
}
