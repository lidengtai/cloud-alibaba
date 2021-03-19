package com.taylor.springcloudalibaba;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/20 0:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication.class, args);
        System.out.println("nacos 83服务启动......");
    }
}
