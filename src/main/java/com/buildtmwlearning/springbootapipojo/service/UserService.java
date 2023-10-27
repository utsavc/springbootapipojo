package com.buildtmwlearning.springbootapipojo.service;

import com.buildtmwlearning.springbootapipojo.entities.User;

public interface UserService {
    User setUser(User user);
    User getUser();
    String getFirstName();
    String getLastName();
}
