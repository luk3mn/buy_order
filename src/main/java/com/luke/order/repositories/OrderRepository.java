package com.luke.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
