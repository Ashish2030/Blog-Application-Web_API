package com.ashish.upgrad.Blog.repository;

import com.ashish.upgrad.Blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,String>
{
}
