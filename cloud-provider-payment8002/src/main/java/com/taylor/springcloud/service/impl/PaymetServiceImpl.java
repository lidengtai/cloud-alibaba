package com.taylor.springcloud.service.impl;

import com.taylor.springcloud.dao.PaymentDao;
import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/23 23:16
 */
@Service
public class PaymetServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(PaymentEntity paymentEntity) {
        return paymentDao.save(paymentEntity);
    }

    @Override
    public PaymentEntity getPaymentByID(Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
