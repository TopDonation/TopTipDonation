package com.tipdonation.service;

import java.util.List;

import com.tipdonation.entity.User;

public interface UserDetailsService extends org.springframework.security.core.userdetails.UserDetailsService {

    public List<User> findAll();
}
