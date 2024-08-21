package com.ms.ecommerce.dto;

import lombok.Data;

@Data

public class Product {
    private int productId;
    private String productName;
    private String description;
    private int price;
    private int stockQuantity;
    private int categoryId;
    private int supplierId;
}
