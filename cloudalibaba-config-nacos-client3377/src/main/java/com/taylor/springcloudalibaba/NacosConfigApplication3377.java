package com.taylor.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/20 22:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication3377.class,args);
        System.out.println("nacos 配置中心3377服务启动.....");
    }
}
