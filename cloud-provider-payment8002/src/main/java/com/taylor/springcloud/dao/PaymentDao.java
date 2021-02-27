package com.taylor.springcloud.dao;

import com.taylor.springcloud.entities.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author taylor
 * @Description:
 * @date 2021/2/23 0:47
 */
@Mapper
public interface PaymentDao {

    int save(PaymentEntity paymentEntity);
    PaymentEntity getPaymentByID(@Param("id") Long id);
}
