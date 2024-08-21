package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Review;
import com.ms.ecommerce.repository.ReviewRepository;
import com.ms.ecommerce.repository.ReviewRepositoryImpl;

public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository = ReviewRepositoryImpl.getInstance();

    private ReviewServiceImpl(){}
    private static ReviewServiceImpl reviewService;

    public static ReviewServiceImpl getInstance(){
        if(reviewService == null){
//            System.out.println("inside the if condition");
            reviewService = new ReviewServiceImpl();
            return reviewService;
        }
        return reviewService;
    }

    @Override
    public Review addReview(Review review) {
        return reviewRepository.addReview(review);
    }

    @Override
    public Review[] getAllReview() {
        return reviewRepository.getAllReview();
    }

    @Override
    public Review getReviewById(int id) {
        return reviewRepository.getReviewById(id);
    }

    @Override
    public String deleteReviewById(int id) {
        return reviewRepository.deleteReviewById(id);
    }

    @Override
    public Review updateReviewById(int id, Review review) {
        return reviewRepository.updateReviewById(id, review);
    }
}
