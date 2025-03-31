package com.blog.application.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;

    @OneToMany(mappedBy = "blogPost", cascade = CascadeType.ALL)
   // @JsonManagedReference
    private List<Comment> comments = new ArrayList<>();

}
