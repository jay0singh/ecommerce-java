package com.ms.ecommerce.service;

public class ReviewServiceImpl {
    private ReviewServiceImpl(){
    }
    private static ReviewServiceImpl reviewService;

    public static ReviewServiceImpl getInstance(){
        if(reviewService == null){
            System.out.println("inside the if condition");
            reviewService = new ReviewServiceImpl();
            return reviewService;
        }
        return reviewService;
    }
}
