package com.ashok.service;

import java.util.List;

import com.ashok.exception.ProductException;
import com.ashok.modal.Rating;
import com.ashok.modal.User;
import com.ashok.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
