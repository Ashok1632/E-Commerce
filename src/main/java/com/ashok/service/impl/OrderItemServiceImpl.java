package com.ashok.service.impl;

import org.springframework.stereotype.Service;

import com.ashok.modal.OrderItem;
import com.ashok.repository.OrderItemRepository;
import com.ashok.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	private OrderItemRepository orderItemRepository;
	public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
		this.orderItemRepository=orderItemRepository;
	}
	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		
		return orderItemRepository.save(orderItem);
	}

}
