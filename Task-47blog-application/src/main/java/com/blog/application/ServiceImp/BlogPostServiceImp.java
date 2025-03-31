package com.blog.application.ServiceImp;

import com.blog.application.Entity.BlogPost;
import com.blog.application.Repositories.BlogPostRepo;
import com.blog.application.Service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostServiceImp implements BlogPostService {
    @Autowired
    BlogPostRepo blogPostRepo;

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepo.save(blogPost);
    }

    public BlogPost getBlogPostById(Long postId) {
        return blogPostRepo.findById(postId).orElseThrow();
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepo.findAll();
    }
}
