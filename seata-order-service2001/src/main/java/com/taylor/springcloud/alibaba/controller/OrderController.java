package com.taylor.springcloud.alibaba.controller;

import com.taylor.springcloud.alibaba.service.OrderService;
import com.taylor.springcloud.alibaba.domain.Order;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/28 22:23
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public ResponseCommon create(Order order) {
        orderService.create(order);
        return new ResponseCommon(200,"订单创建成功！");
    }

}
