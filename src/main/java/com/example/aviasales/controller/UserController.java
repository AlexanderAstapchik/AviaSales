package com.example.aviasales.controller;

import com.example.aviasales.dao.impl.InMemoryUserDao;
import com.example.aviasales.entity.User;
import com.example.aviasales.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private InMemoryUserDao inMemoryUserDao;

    @Autowired
    private UserService userService;

    @PostMapping
    public User save (@RequestBody User user){
       return userService.save(user);

    }

    @GetMapping
    public List<User> findAll(){
        return inMemoryUserDao.findAll();
    }
    @GetMapping("/{username}")
    public ResponseEntity <User> findByUsername(@PathVariable String username){
        User byUsername = inMemoryUserDao.findByUsername(username);
        if (byUsername!=null){
            return ResponseEntity.ok(byUsername);
        }
        return ResponseEntity.badRequest().build();
    }
    public ResponseEntity <User> findByEmail (@PathVariable String email){
        User byEmail= inMemoryUserDao.findByEmail(email);
        if (byEmail !=null){
            return ResponseEntity.ok(byEmail);
        }
        return ResponseEntity.badRequest().build();
    }
}

