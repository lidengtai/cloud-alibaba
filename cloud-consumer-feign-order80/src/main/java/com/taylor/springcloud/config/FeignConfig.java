package com.taylor.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author taylor
 * @Description: feign 开启日志配置类
 * @date 2021/3/4 23:30
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.FULL;
    }
}
