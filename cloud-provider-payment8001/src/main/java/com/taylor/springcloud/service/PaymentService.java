package com.taylor.springcloud.service;

import com.taylor.springcloud.entities.PaymentEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/23 23:15
 */
public interface PaymentService {
    int save( PaymentEntity paymentEntity);
    PaymentEntity getPaymentByID(@Param("id") Long id);
}
