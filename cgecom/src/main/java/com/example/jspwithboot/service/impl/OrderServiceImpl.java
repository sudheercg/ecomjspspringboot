package com.example.jspwithboot.service.impl;

import org.springframework.stereotype.Service;

import com.example.jspwithboot.model.Order;
import com.example.jspwithboot.repositories.OrderRepository;
import com.example.jspwithboot.service.iface.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }
}
