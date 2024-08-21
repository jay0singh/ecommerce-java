package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.OrderItems;

import java.util.ArrayList;
import java.util.LinkedList;

public class OrderItemsRepositoryImpl implements OrderItemsRepository {

    private ArrayList<OrderItems> orderItemsArrayList= new ArrayList<>();
    private LinkedList<OrderItems> orderItemsLinkedList = new LinkedList<>();

    private OrderItemsRepositoryImpl() {}
    private static OrderItemsRepositoryImpl orderItemRepository;

    public static OrderItemsRepositoryImpl getInstance() {
        if (orderItemRepository == null) {
            orderItemRepository = new OrderItemsRepositoryImpl();
            return orderItemRepository;
        }
        return orderItemRepository;
    }

    @Override
    public OrderItems addOrderItem(OrderItems orderItem) {
        OrderItems orderItems1 = null;
        if (orderItemsArrayList.add(orderItem)) {
            orderItems1 = orderItem;
        }
        return orderItems1;
    }

    @Override
    public OrderItems[] getAllOrderItems() {
        OrderItems[] array = orderItemsArrayList.toArray(new OrderItems[orderItemsArrayList.size()]);
        return array;
    }

    @Override
    public OrderItems getOrderItemById(int id) {
        for(OrderItems orderItems : orderItemsArrayList){
            if(orderItems.getOrderItemId() == id){
                return orderItems;
            }
        }
        return null;
    }

    @Override
    public String deleteOrderItemById(int id) {
        OrderItems orderItems = this.getOrderItemById(id);
        if(orderItems != null){
            if(orderItemsArrayList.remove(orderItems)){
                return "Done";
            }
            else{
                return "Not Done";
            }
        }
        return "Not found";
    }

    @Override
    public OrderItems updateOrderItemById(int id, OrderItems orderItemUpdate) {

        for(OrderItems orderItem : orderItemsArrayList){
            if(orderItem.getOrderItemId() == id){
                orderItem = orderItemUpdate;
            }
        }
        return null;
    }
}

