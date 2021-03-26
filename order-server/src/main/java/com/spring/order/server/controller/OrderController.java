package com.spring.order.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @GetMapping("getOrder")
    public List<String> getOrder() {
        List<String> list = new ArrayList<>();
        list.add("陈韦迪");
        list.add("张健");
        list.add("李明");
        list.add("杨旺");
        return list;
    }
}
