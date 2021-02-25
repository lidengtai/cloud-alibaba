package com.taylor.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/25 23:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {
    private Long id;
    private String serial;
}

