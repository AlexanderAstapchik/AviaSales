package com.example.aviasales.validators;

import com.example.aviasales.dao.impl.InMemoryUserDao;
import com.example.aviasales.entity.User;
import com.example.aviasales.exceptions.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
public class UserValidator  {
    @Autowired
    private InMemoryUserDao inMemoryUserDao;


    public void validate(User user) throws ValidationException {
        if (user.getUsername().length() < 4 || user.getUsername().length() > 10) {
            throw new ValidationException("error.username.size");
//        } else if (inMemoryUserDao.findByUsername(user.getUsername()).isPresent()) {
//            throw new ValidationException( "error.username.exist");
        }

        if (!checkEmail(user.getEmail())) {
            throw new ValidationException("error.email.valid");
        }
////        if (inMemoryUserDao.findByEmail(user.getEmail()).isPresent()) {
////            throw new ValidationException("error.email.exist");
//        }
    }

    private boolean checkEmail(String email) {
        Pattern emailPattern = Pattern.compile("^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$");
        Matcher emailMatcher = emailPattern.matcher(email);
        return emailMatcher.find();
    }
}
