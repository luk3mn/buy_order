package com.luke.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.order.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
