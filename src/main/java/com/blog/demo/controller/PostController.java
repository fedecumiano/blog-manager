package com.blog.demo.controller;

import com.blog.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("list", postService.getAllPosts());
        return "index";
    }

}
