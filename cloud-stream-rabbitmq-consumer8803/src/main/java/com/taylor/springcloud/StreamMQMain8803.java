package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/17 23:35
 */
@SpringBootApplication
public class StreamMQMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
        System.out.println("rabbitmq 消费者8803服务启动......");
    }
}
