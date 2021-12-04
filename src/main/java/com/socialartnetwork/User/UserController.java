package com.socialartnetwork.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> fetchUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public List<User> fetchUserById(@PathVariable("id") Long id) {
        return this.userRepository.findUserById(id);
    }
}
