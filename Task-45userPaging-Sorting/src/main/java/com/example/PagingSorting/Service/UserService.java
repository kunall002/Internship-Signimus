package com.example.PagingSorting.Service;

import com.example.PagingSorting.Repository.UserRepo;
import com.example.PagingSorting.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Page<User> getAllUsersPaginatedAndSorted(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public List<User> getAllUsersSorted(String sortBy, String direction) {
        Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        return userRepository.findAll(sort);
    }
}

