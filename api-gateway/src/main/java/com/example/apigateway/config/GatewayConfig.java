package com.example.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @description: 网关配置 java Bean方式
 * @author: HyJan
 * @create: 2020-05-13 18:44
 **/
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("path_route2",r -> r.path("/user/getByUsername")
                .uri("http://localhost:8201/user/getByUsername"))
                .build();
    }
}
