package com.blog.application.Controller;

import com.blog.application.Entity.BlogPost;
import com.blog.application.Entity.Comment;
import com.blog.application.Service.BlogPostService;
import com.blog.application.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")  // Fixed mapping
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping("/{commentId}")
    public ResponseEntity<Comment> getCommentById(@PathVariable Long commentId) {
        return ResponseEntity.ok(commentService.getCommentById(commentId));
    }

    @PostMapping("/{postId}")
    public ResponseEntity<Comment> addCommentToPost(@PathVariable Long postId, @RequestBody Comment comment) {
        BlogPost blogPost = blogPostService.getBlogPostById(postId);
        if (blogPost == null) {
            return ResponseEntity.notFound().build();
        }
        comment.setBlogPost(blogPost);
        Comment savedComment = commentService.saveComment(comment);
        return ResponseEntity.ok(savedComment);
    }
    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long commentId, @RequestBody String newText) {
        return ResponseEntity.ok(commentService.updateComment(commentId, newText));
    }
}
