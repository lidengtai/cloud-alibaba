package com.taylor.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/19 23:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication9002.class,args);
        System.out.println("nacos 9002 服务启动......");
    }
}
