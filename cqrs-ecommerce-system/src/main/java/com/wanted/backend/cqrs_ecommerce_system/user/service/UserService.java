package com.wanted.backend.cqrs_ecommerce_system.user.service;

import com.wanted.backend.cqrs_ecommerce_system.user.entiry.User;
import com.wanted.backend.cqrs_ecommerce_system.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
