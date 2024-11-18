package com.junaid.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{orderId}")
    public ResponseEntity<String> getOrder(@PathVariable String orderId) {
        String user = restTemplate.getForObject("http://user-service:9093/user/123", String.class);
        return ResponseEntity.ok("Order details for order: " + orderId + " with user info: " + user);
    }
}
