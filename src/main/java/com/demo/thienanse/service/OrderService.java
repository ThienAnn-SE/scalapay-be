package com.demo.thienanse.service;

import com.demo.thienanse.entity.request.OrderRequest;
import com.demo.thienanse.entity.response.OrderResponse;

public interface OrderService {
    OrderResponse createOrder(OrderRequest order);
}
