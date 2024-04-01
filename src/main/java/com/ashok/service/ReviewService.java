package com.ashok.service;

import java.util.List;

import com.ashok.exception.ProductException;
import com.ashok.modal.Review;
import com.ashok.modal.User;
import com.ashok.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
