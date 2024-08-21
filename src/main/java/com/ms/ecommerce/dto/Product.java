package com.ms.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int productId;
    private String productName;
    private String description;
    private int price;
    private int stockQuantity;
    private int categoryId;
    private int supplierId;
}
