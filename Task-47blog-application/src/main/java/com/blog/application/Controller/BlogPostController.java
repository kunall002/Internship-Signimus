package com.blog.application.Controller;

import com.blog.application.Entity.BlogPost;
import com.blog.application.Service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class BlogPostController {
   @Autowired
    BlogPostService blogPostService;

    @PostMapping
    public ResponseEntity<BlogPost> createBlogPost(@RequestBody BlogPost blogPost) {
        return ResponseEntity.ok(blogPostService.createBlogPost(blogPost));
    }

    @GetMapping("/{postId}")
    public ResponseEntity<BlogPost> getBlogPostById(@PathVariable Long postId) {
        return ResponseEntity.ok(blogPostService.getBlogPostById(postId));
    }

    @GetMapping
    public ResponseEntity<List<BlogPost>> getAllBlogPosts() {
        return ResponseEntity.ok(blogPostService.getAllBlogPosts());
    }
}

