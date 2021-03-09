package com.taylor.spirngcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taylor
 * @Description: @RefreshScope
 *    以这种方式注释的Bean可以在运行时刷新，
 *   并且正在使用的任何组件都将在下一个方法调用时获得一个新实例，
 *   该实例将完全初始化并注入所有依赖项
 * @date 2021/3/9 23:11
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "server.port = " + serverPort + "\t configInfo=" + configInfo;
    }
}