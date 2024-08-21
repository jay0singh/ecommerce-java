package com.ms.ecommerce.dto;

import lombok.Data;

@Data
public class OrderItems {
    private int orderItemId;
    private int orderId;
    private int productId;
    private int quantity;
    private int price;
}
