package com.ms.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderItems {
    private int orderItemId;
    private int orderId;
    private int productId;
    private int quantity;
    private int price;
}
