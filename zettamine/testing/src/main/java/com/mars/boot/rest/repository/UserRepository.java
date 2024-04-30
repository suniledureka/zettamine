package com.mars.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mars.boot.rest.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
