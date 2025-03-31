package com.inn.OneToOne.Repository;


import com.inn.OneToOne.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
