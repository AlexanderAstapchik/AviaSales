package com.example.aviasales.service;

import com.example.aviasales.dao.impl.InMemoryUserDao;
import com.example.aviasales.entity.User;
import com.example.aviasales.exceptions.ValidationException;
import com.example.aviasales.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private InMemoryUserDao inMemoryUserDao;
    @Autowired
    private UserValidator userValidator;
    public User save(User user) {
        try {
            userValidator.validate(user);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        return inMemoryUserDao.save(user);
    }

}
