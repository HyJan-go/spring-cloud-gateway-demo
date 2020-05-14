package com.example.apigateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @program: demo
 * @description: 使用redis对路由限速配置
 * @author: HyJan
 * @create: 2020-05-13 18:49
 **/
@Configuration
public class RedisRateLimiterConfig {

    @Bean
    public KeyResolver ipResolver(){
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

}
