package com.taylor.springcloud.alibaba.service;

import com.taylor.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderService {

    void create(Order order);

    //修改订单状态
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
