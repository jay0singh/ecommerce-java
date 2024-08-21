package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Review;

import java.util.ArrayList;

public class ReviewRepositoryImpl implements ReviewRepository{
    private ReviewRepositoryImpl() {
    }
    private static ReviewRepositoryImpl reviewRepository;

    private ArrayList<Review> reviewArrayList = new ArrayList<>();

    public static ReviewRepositoryImpl getInstance() {
        if (reviewRepository == null) {
            reviewRepository = new ReviewRepositoryImpl();
            return reviewRepository;
        }
        return reviewRepository;
    }

    @Override
    public Review addReview(Review review) {
        if(reviewArrayList.add(review)){
            return review;
        }
        return null;
    }

    @Override
    public Review[] getAllReview() {
        Review[] array = reviewArrayList.toArray(new Review[reviewArrayList.size()]);
        return array;
    }

    @Override
    public Review getReviewById(int id) {
        for(Review review : reviewArrayList){
            if(review.getReviewId() == id){
                return review;
            }
        }
        return null;
    }

    @Override
    public String deleteReviewById(int id) {
        Review review = this.getReviewById(id);
        if(review != null){
            if(reviewArrayList.remove(review)){
                return "Done";
            }
            else{
                return "Failed";
            }
        }
        return "Not Found";
    }

    @Override
    public Review updateReviewById(int id, Review review) {
        for(Review review1 : reviewArrayList){
            if(review1.getReviewId() == id){
                review1 = review;
            }
        }
        return null;
    }
}

