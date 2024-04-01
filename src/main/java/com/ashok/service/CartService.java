package com.ashok.service;

import com.ashok.exception.ProductException;
import com.ashok.modal.Cart;
import com.ashok.modal.CartItem;
import com.ashok.modal.User;
import com.ashok.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
