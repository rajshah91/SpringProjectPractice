package com.myapp.springlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.springlogin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
