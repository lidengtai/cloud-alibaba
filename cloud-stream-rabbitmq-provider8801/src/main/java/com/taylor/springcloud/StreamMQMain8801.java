package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/17 22:23
 */
@SpringBootApplication
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
        System.out.println("rabbitmq 生产者服务启动......");
    }
}
