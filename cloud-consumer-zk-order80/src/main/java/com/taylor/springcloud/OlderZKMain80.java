package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/2/28 23:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OlderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OlderZKMain80.class,args);
        System.out.println("消费端注册zk服务启动......");
    }
}
