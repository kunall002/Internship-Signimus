package com.example.user.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

}
