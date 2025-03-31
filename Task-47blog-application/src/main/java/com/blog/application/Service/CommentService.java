package com.blog.application.Service;

import com.blog.application.Entity.Comment;

public interface CommentService {

    Comment getCommentById(Long commentId);

    Comment updateComment(Long commentId, String newText);
    Comment saveComment(Comment comment);
}
