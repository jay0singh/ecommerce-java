package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Orders;
import com.ms.ecommerce.repository.OrderRepository;
import com.ms.ecommerce.repository.OrderRepositoryImpl;

public class OrderServiceImpl implements OrderService{
    private OrderRepository orderRepository = OrderRepositoryImpl.getInstance();

    private OrderServiceImpl() {}
    private static OrderServiceImpl orderService; //customerService follows camel naming Convention.


    public static OrderServiceImpl getInstance() {
        if (orderService == null) {
            System.out.println("inside the if condition");
            orderService = new OrderServiceImpl();
            return orderService;
        }
        return orderService;
    }

    @Override
    public Orders addOrder(Orders order) {
        return orderRepository.addOrder(order);
    }

    @Override
    public Orders[] getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Orders getOrderById(int id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public String deleteOrderById(int id) {
        return orderRepository.deleteOrderById(id);
    }

    @Override
    public Orders updateOrderById(int id, Orders order) {
        return orderRepository.updateOrderById(id, order);
    }
}
