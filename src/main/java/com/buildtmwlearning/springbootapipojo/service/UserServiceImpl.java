package com.buildtmwlearning.springbootapipojo.service;

import com.buildtmwlearning.springbootapipojo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private User user;

    @Override
    public User setUser(User user) {
        this.user=user;
        return user;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String getFirstName() {
        return user.getFirstName();
    }

    @Override
    public String getLastName() {
        return user.getLastName();
    }
}
