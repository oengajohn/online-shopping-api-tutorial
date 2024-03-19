package io.github.oengajohn.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.oengajohn.orderservice.model.GenericResponse;
import io.github.oengajohn.orderservice.model.OrderRequest;
import io.github.oengajohn.orderservice.service.OrderService;

@RequestMapping("api/orders")
@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("placeOrder")
    public GenericResponse<?> placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        GenericResponse<?> resp = GenericResponse.builder()
                .success(true)
                .msg("Order placed successfully")
                .build();
        return resp;
    }

}
