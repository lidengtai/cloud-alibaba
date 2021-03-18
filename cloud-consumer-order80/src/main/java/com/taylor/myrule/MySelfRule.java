package com.taylor.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author taylor
 * @Description: 通过Ribbon替换负载均衡策略: 此类不能被@ComponentScan注解扫描到
 * @date 2021/3/3 22:18
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
//        return new RandomRule();
    }
}
