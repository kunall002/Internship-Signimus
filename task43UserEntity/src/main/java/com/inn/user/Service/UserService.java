package com.inn.user.Service;


import com.inn.user.Repo.UserRepo;
import com.inn.user.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {
        @Autowired
        private UserRepo userRepository;

        public ResponseEntity<User> getUserByUsername(String username) {
            return userRepository.findByUsername(username)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        public ResponseEntity<List<User>> getUsersAboveAge(int age) {
            List<User> users = userRepository.findUsersAboveAge(age);
            return ResponseEntity.ok(users);
        }

        public ResponseEntity<String> updateUserEmail(Long id, String email) {
            int updated = userRepository.updateUserEmail(id, email);
            return updated > 0 ? ResponseEntity.ok("User email updated successfully") : ResponseEntity.notFound().build();
        }

        public ResponseEntity<String> deleteUser(Long id) {
            int deleted = userRepository.deleteUserById(id);
            return deleted > 0 ? ResponseEntity.ok("User deleted successfully") : ResponseEntity.notFound().build();
        }
}

