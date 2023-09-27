package com.demo.thienanse.controller;

import com.demo.thienanse.entity.request.OrderRequest;
import com.demo.thienanse.entity.response.OrderResponse;
import com.demo.thienanse.service.OrderService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest order){
        return orderService.createOrder(order);
    }
}
