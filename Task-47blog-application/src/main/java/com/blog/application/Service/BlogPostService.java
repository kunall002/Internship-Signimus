package com.blog.application.Service;

import com.blog.application.Entity.BlogPost;

import java.util.List;

public interface BlogPostService {
    BlogPost createBlogPost(BlogPost blogPost);

    BlogPost getBlogPostById(Long postId);

    List<BlogPost> getAllBlogPosts();
}
