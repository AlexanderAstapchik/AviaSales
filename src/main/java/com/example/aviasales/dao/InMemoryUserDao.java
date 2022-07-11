package com.example.aviasales.dao;

import com.example.aviasales.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryUserDao {
    private final List<User> users = new ArrayList<>();
    private long IncId = 1;

    public User save(User user) {
        user.setId(IncId++);
        users.add(user);
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public Optional<User> findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public Optional<User> findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}

