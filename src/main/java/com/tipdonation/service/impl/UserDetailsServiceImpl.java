package com.tipdonation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tipdonation.entity.User;
import com.tipdonation.repositorium.UserRepositorium;
import com.tipdonation.service.UserDetailsService;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepositorium userRepositorium;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = userRepositorium.findPrincipalByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("User " + s + " not found");
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepositorium.findAll();
    }
}
