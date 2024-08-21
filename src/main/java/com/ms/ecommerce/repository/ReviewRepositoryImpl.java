package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Review;

public class ReviewRepositoryImpl implements ReviewRepository{
    private ReviewRepositoryImpl() {
    }
    private static ReviewRepositoryImpl reviewRepository;

    public static ReviewRepositoryImpl getInstance() {
        if (reviewRepository == null) {
            reviewRepository = new ReviewRepositoryImpl();
            return reviewRepository;
        }
        return reviewRepository;
    }

    @Override
    public Review addReview(Review review) {
        return null;
    }

    @Override
    public Review[] getAllReview() {
        return new Review[0];
    }

    @Override
    public Review getReviewById(int id) {
        return null;
    }

    @Override
    public String deleteReviewById(int id) {
        return "";
    }

    @Override
    public Review updateReviewById(int id, Review review) {
        return null;
    }
}

