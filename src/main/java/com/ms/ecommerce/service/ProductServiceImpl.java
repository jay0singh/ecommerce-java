package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Product;

public class ProductServiceImpl {
    private ProductServiceImpl() {
    }
    private static ProductServiceImpl productService;

    public static ProductServiceImpl getInstance() {
        if (productService == null) {
            System.out.println("inside the if condition");
            productService = new ProductServiceImpl();
            return productService;
        }
        return productService;
    }
}
