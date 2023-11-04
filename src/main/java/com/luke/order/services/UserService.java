package com.luke.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luke.order.entities.User;
import com.luke.order.repositories.UserRepository;

@Service // register this class as a component, to be able to inject automatically with Autowired
public class UserService {
    @Autowired
    private UserRepository repository;

    // service layer
    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
