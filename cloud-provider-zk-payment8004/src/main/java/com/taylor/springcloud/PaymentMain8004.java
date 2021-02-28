package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: zookeeper 注册中心启动类
 *  consul 和 zookeeper 作为注册中心时注册服务用此注解 @EnableDiscoveryClient
 *  在 zookeeper中是临时节点
 * @date 2021/2/28 17:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
        System.out.println("连接zk注册中心服务启动...");
    }
}
