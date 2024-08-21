package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Orders;

import java.util.ArrayList;

public class OrderRepositoryImpl implements OrderRepository{
    private ArrayList<Orders> ordersArrayList = new ArrayList<>();

    private OrderRepositoryImpl() {}
    private static OrderRepositoryImpl orderRepository;


    public static OrderRepositoryImpl getInstance() {
        if (orderRepository == null) {
            orderRepository = new OrderRepositoryImpl();
            return orderRepository;
        }
        return orderRepository;
    }

    @Override
    public Orders addOrder(Orders order) {
        if (ordersArrayList.add(order)) {
            return order;
        }
        return null;
    }

    @Override
    public Orders[] getAllOrders() {
        Orders[] array = ordersArrayList.toArray(new Orders[ordersArrayList.size()]);
        return array;
    }

    @Override
    public Orders getOrderById(int id) {
        for (Orders order : ordersArrayList) {
            if(order.getCustomerId() == id){
                return order;
            }
        }
        return null;
    }

    @Override
    public String deleteOrderById(int id) {
        Orders order = this.getOrderById(id);
        if(order != null){
            if(ordersArrayList.remove(order)){
                return "done";
            }
            else{
                return "fail";
            }
        }
        return "not found";
    }

    @Override
    public Orders updateOrderById(int id, Orders order) {
        for(Orders order1 : ordersArrayList ){
            if(order1.getOrderId() == id){
                order1 = order;
            }
        }
        return null;
    }
}

