package com.spring.restaurant.service;

import com.spring.restaurant.deo.OrderRepository;
import com.spring.restaurant.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return orderRepository.findAll(pageable).getContent();
    }

    public List<Order> getOrderByIdCategories(Long id, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.orderRepository.findByCategoryId(id, pageable).getContent();
    }

    public List<Order> getOrderByKey(String key, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.orderRepository.findByNameContaining(key, pageable).getContent();
    }

    public Order getOrder(Long id) {

        return this.orderRepository.findById(id).get();
    }

    public Long getAllOrdersSize() {
return  orderRepository.count();
    }



    public long getOrdersByCategoryIdLength(Long id){
        return orderRepository.getOrderLengthByCategoryId(id);

    }
    public long getOrderSizeByKey( String key){
        return orderRepository.getOrderSizeByKey(key);

    }


}

