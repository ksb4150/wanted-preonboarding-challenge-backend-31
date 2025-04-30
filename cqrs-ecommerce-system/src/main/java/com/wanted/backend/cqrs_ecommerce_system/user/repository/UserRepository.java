package com.wanted.backend.cqrs_ecommerce_system.user.repository;

import com.wanted.backend.cqrs_ecommerce_system.user.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
