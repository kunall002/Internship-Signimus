package com.blog.application.Repositories;

import com.blog.application.Entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepo extends JpaRepository<BlogPost,Long > {
}
