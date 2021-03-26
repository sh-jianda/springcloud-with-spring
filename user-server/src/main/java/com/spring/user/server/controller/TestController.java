package com.spring.user.server.controller;

import com.spring.user.server.api.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    OrderInterface orderInterface;

    @GetMapping("/test")
    public Object test(){
        Map <String,Object> map = new HashMap<>();
        map.put("order",orderInterface.getOrder());
        return map;
    }
}
