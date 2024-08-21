package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.OrderItems;

public interface OrderItemsService {
    public OrderItems addOrderItem(OrderItems orderItem);
    public OrderItems[] getAllOrderItems();
    public OrderItems getOrderItemById(int id);
    public String deleteOrderItemById(int id);
    public OrderItems updateOrderItemById(int id, OrderItems orderItem);
}
