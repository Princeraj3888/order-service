package com.exploretechs.controller;

import com.exploretechs.domain.Order;
import com.exploretechs.repository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderDao orderRepository;

    @GetMapping("/orders")
    public List<Order> orderList(){
        return orderRepository.buildOrders();
    }
}
