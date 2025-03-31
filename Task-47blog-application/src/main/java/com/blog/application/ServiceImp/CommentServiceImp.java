package com.blog.application.ServiceImp;

import com.blog.application.Entity.Comment;
import com.blog.application.Repositories.CommentRepo;
import com.blog.application.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp implements CommentService {
    @Autowired
    private CommentRepo commentRepo;



    @Override
    public Comment getCommentById(Long commentId) {
        return commentRepo.findById(commentId).orElseThrow();
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepo.save(comment);
    }

    @Override
    public Comment updateComment(Long commentId, String newText) {
        Comment comment = commentRepo.findById(commentId).orElseThrow();
        comment.setText(newText);
        return commentRepo.save(comment);
    }
}
