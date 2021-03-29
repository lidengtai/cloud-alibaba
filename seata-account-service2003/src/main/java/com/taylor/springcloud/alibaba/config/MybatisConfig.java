package com.taylor.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.taylor.springcloud.alibaba.dao"})
public class MybatisConfig {
}
