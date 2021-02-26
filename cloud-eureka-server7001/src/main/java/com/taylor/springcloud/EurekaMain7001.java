package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author taylor
 * @Description: eureka注册服务中心
 * @date 2021/2/26 22:11
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
        System.out.println("eureka7001 注册中心服务启动.....");
    }
}



