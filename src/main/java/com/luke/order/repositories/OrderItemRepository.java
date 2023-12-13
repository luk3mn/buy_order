package com.luke.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.order.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
