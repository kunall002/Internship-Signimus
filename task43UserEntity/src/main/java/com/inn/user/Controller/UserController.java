package com.inn.user.Controller;

import com.inn.user.Service.UserService;
import com.inn.user.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserService userService;

        @GetMapping("/username/{username}")
        public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
            return userService.getUserByUsername(username);
        }
    @GetMapping("/age/{age}")
    public ResponseEntity<List<User>> getUsersAboveAge(@PathVariable int age) {
        return userService.getUsersAboveAge(age);
    }

    @PutMapping("/update-email/{id}")
    public ResponseEntity<String> updateUserEmail(@PathVariable Long id, @RequestParam String email) {
        return userService.updateUserEmail(id, email);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
