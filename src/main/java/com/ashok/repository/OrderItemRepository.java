package com.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
