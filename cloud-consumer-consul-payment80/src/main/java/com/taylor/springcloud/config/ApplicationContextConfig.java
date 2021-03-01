package com.taylor.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author taylor
 * @Description: rest接口调用配置类
 * @date 2021/2/25 23:08
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //LoadBalanced 注解开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
