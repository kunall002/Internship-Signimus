package com.example.PagingSorting.Repository;
import com.example.PagingSorting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepo extends JpaRepository<User, Long> {
    Page<User> findAll(Pageable pageable);
}
