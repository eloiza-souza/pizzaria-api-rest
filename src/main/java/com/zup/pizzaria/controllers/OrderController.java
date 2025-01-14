package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.OrderDTO;
import com.zup.pizzaria.models.OrderModel;
import com.zup.pizzaria.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderModel order) {
        OrderDTO orderDTO = orderService.createOrder(order);
        return ResponseEntity.ok(orderDTO);
    }

}
