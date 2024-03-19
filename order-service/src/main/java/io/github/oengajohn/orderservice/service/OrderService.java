package io.github.oengajohn.orderservice.service;

import io.github.oengajohn.orderservice.model.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
    
}
