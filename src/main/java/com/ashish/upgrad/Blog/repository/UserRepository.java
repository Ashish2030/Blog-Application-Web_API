package com.ashish.upgrad.Blog.repository;

import com.ashish.upgrad.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}