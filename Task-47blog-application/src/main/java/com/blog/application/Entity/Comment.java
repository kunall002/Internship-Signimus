package com.blog.application.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne()
    //@JsonBackReference
    @JoinColumn(name = "BlogPost_id")
    private BlogPost blogPost;
}
