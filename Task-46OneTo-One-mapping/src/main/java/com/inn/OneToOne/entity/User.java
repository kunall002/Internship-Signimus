package com.inn.OneToOne.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    @OneToOne(cascade = CascadeType.ALL) // If user is deleted, profile is also deleted
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;
}
