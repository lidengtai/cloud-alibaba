package com.taylor.springcloud;

/**
 * @author taylor
 * @Description: 支付模块主启动类
 * @date 2021/2/22 23:33
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//服务发现注解
@EnableDiscoveryClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
        System.out.println("8001支付服务已启动.....");
    }
}
