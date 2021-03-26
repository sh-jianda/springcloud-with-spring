package com.spring.api.gateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("order-server")
public interface OrderInterface {
    @GetMapping("getOrder")
    public List<String> getOrder();
}
