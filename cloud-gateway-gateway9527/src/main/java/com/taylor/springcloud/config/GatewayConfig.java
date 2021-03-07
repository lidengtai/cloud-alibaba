package com.taylor.springcloud.config;

import javafx.scene.transform.Rotate;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author taylor
 * @Description: 1 java类配置文件的方式 2 yml方式
 * @date 2021/3/7 23:20
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator myConfig(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        RouteLocator locator = routes.route("javaApi", f -> f.path("/api")
                .uri("https://www.matools.com/api")).build();
        return locator;
    }
}
