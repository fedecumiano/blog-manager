package com.blog.demo.service;

import com.blog.demo.model.Post;
import com.blog.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
