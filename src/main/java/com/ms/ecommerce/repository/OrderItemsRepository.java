package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.OrderItems;

public interface OrderItemsRepository {
    public OrderItems addOrderItem(OrderItems orderItem);
    public OrderItems[] getAllOrderItems();
    public OrderItems getOrderItemById(int id);
    public String deleteOrderItemById(int id);
    public OrderItems updateOrderItemById(int id, OrderItems orderItem);
}
