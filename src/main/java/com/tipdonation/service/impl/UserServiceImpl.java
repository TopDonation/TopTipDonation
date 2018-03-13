package com.tipdonation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tipdonation.entity.User;
import com.tipdonation.repositorium.UserRepositorium;
import com.tipdonation.service.UserService;

@Service
public class UserServiceImpl
implements UserService{

    @Autowired
    private UserRepositorium userRepositorium;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public User save(User user) {
        User userToRegister = user;
        userToRegister.setPassword(encoder.encode(userToRegister.getPassword()));

        return userRepositorium.save(userToRegister);
    }
}
