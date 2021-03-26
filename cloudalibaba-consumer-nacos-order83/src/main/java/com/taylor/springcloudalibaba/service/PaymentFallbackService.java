package com.taylor.springcloudalibaba.service;

import com.taylor.springcloud.entities.PaymentEntity;
import com.taylor.springcloud.entities.ResponseCommon;
import org.springframework.stereotype.Component;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/26 23:58
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public ResponseCommon<PaymentEntity> paymentSQL(Long id) {
        return new ResponseCommon<>(444, "fallback");
    }
}
