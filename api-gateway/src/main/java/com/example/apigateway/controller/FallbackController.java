package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description: 降级 controller
 * @author: HyJan
 * @create: 2020-05-13 19:45
 **/
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Object fallback() {
        Map<String,Object> map = new HashMap<>();
        map.put("data",null);
        map.put("message","Get request fallback!");
        map.put("code",500);
        return map;
    }

}
