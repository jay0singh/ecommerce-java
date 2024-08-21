package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Review;

public interface ReviewService {
    public Review addReview(Review review);
    public Review[] getAllReview();
    public Review getReviewById(int id);
    public String deleteReviewById(int id);
    public Review updateReviewById(int id,Review review);
}
