package com.junaid.PaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{paymentId}")
    public ResponseEntity<String> getPayment(@PathVariable String paymentId) {
        String order = restTemplate.getForObject("http://order-service:9091/order/456", String.class);
        return ResponseEntity.ok("Payment details for payment: " + paymentId + " with order info: " + order);
    }
}
