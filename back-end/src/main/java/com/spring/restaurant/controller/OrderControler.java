package com.spring.restaurant.controller;

import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControler {
    private OrderService orderService ;

    @Autowired
    public OrderControler(OrderService orderService) {
        this.orderService = orderService;
    }
}
