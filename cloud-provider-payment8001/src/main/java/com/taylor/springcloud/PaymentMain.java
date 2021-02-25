package com.taylor.springcloud;

/**
 * @author taylor
 * @Description: 支付模块主启动类
 * @date 2021/2/22 23:33
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
        System.out.println("支付服务已启动.....");
    }
}
