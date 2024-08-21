package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Orders;

public interface OrderService {
    public Orders addOrder(Orders order);
    public Orders[] getAllOrders();
    public Orders getOrderById(int id);
    public String deleteOrderById(int id);
    public Orders updateOrderById(int id, Orders order);
}
