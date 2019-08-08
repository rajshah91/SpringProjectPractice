package com.myapp.springlogin.service;

import com.myapp.springlogin.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
