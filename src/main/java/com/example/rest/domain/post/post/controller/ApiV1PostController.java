package com.example.rest.domain.post.post.controller;

import com.example.rest.domain.post.post.entity.Post;
import com.example.rest.domain.post.post.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/posts")
public class ApiV1PostController {

    private final PostService postService;

    public ApiV1PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    @ResponseBody
    public List<Post> getItems() {
        return postService.getItems();
    }
}
