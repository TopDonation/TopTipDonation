package com.tipdonation.repositorium;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tipdonation.entity.User;

public interface UserRepositorium extends JpaRepository<User, Long> {

    public User findPrincipalByUsername(String username);

    int countByUsername(String username);
}

