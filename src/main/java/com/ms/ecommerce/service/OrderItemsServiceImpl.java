
package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.OrderItems;
import com.ms.ecommerce.repository.OrderItemsRepositoryImpl;

public class OrderItemsServiceImpl implements OrderItemsService{

    private OrderItemsRepositoryImpl orderItemsRepository = OrderItemsRepositoryImpl.getInstance();

    private OrderItemsServiceImpl() {}
    private static OrderItemsServiceImpl orderItemsService; //customerService follows camel naming Convention.


    public static OrderItemsServiceImpl getInstance() {
        if (orderItemsService == null) {
            System.out.println("inside the if condition");
            orderItemsService = new OrderItemsServiceImpl();
            return orderItemsService;
        }
        return orderItemsService;
    }

    @Override
    public OrderItems addOrderItem(OrderItems orderItem) {
        return orderItemsRepository.addOrderItem(orderItem);
    }

    @Override
    public OrderItems[] getAllOrderItems() {
        return orderItemsRepository.getAllOrderItems();
    }

    @Override
    public OrderItems getOrderItemById(int id) {
        return orderItemsRepository.getOrderItemById(id);
    }

    @Override
    public String deleteOrderItemById(int id) {
        return orderItemsRepository.deleteOrderItemById(id);
    }

    @Override
    public OrderItems updateOrderItemById(int id, OrderItems orderItem) {
        return orderItemsRepository.updateOrderItemById(id, orderItem);
    }
}

 