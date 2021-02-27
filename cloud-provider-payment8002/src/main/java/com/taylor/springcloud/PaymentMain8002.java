package com.taylor.springcloud;

/**
 * @author taylor
 * @Description: 支付模块主启动类
 * @date 2021/2/22 23:33
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
        System.out.println("支付服务已启动.....");
    }
}
