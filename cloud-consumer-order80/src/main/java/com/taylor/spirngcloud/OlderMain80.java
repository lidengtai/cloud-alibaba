package com.taylor.spirngcloud;

import com.taylor.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author taylor
 * @Description: 消费端启动类
 * @date 2021/2/25 22:57
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(value = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OlderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OlderMain80.class,args);
        System.out.println("消费端启动.......");

    }
}
