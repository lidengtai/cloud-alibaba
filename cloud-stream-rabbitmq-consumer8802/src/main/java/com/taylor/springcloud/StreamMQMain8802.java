package com.taylor.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/17 23:19
 */
@SpringBootApplication
public class StreamMQMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8802.class,args);
        System.out.println("rabbitmq 消费者8802服务启动......");
    }

}
