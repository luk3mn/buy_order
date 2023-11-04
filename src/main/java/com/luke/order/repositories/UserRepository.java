package com.luke.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // it won't be necessary to create a interface implementation, because, it has already exist in JPA by default
}
