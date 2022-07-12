package com.example.aviasales.dao.impl;

import com.example.aviasales.dao.EntityDao;
import com.example.aviasales.entity.ArrivalPoint;
import com.example.aviasales.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class InMemoryUserDao extends EntityDao<User> {

    public InMemoryUserDao () {
        setEntityClass(User.class);
    }
    public User findByUsername(String username) {
        Query query = em.createQuery("FROM User WHERE username = :username", User.class);
        query.setParameter("username", username);
        User singleResult = (User) query.getSingleResult();
        return singleResult;
    }
    public User findByEmail(String email) {
        Query query = em.createQuery("FROM User WHERE email = :email", User.class);
        query.setParameter("email", email);
        User singleResult = (User) query.getSingleResult();
        return singleResult;
    }
}

