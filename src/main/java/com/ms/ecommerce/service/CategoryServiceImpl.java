package com.ms.ecommerce.service;

public class CategoryServiceImpl {
    private CategoryServiceImpl() {
    }

    private static CategoryServiceImpl categoryService; //customerService follows camel naming Convention.


    public static CategoryServiceImpl getInstance() {
        if (categoryService == null) {
            System.out.println("inside the if condition");
            categoryService = new CategoryServiceImpl();
            return categoryService;
        }
        return categoryService;
    }
}
