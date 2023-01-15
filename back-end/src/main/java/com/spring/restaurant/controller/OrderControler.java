package com.spring.restaurant.controller;

import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class OrderControler {
    private OrderService orderService ;

    @Autowired
    public OrderControler(OrderService orderService) {

        this.orderService = orderService;
    }


    // http://localhost:8080/api/allOrder

    @GetMapping("/api/allOrder")
    public List<Order>allOrders(){
        return orderService.getAllOrders();

    }
}
