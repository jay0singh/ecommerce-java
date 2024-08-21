package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Review;

public interface ReviewRepository {
    public Review addReview(Review review);
    public Review[] getAllReview();
    public Review getReviewById(int id);
    public String deleteReviewById(int id);
    public Review updateReviewById(int id,Review review);
}
