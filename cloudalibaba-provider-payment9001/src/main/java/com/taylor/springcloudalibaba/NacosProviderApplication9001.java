package com.taylor.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/19 22:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication9001.class,args);
        System.out.println("nacos 9001服务启动......");
    }
}
