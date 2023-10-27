package com.buildtmwlearning.springbootapipojo.service;

import com.buildtmwlearning.springbootapipojo.entities.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Mock
    UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void setUser() {
        User user=new User("Utsav","Chaudhary");
        userServiceImpl.setUser(user);
        assertEquals(user,user);
    }

    @Test
    void getUser() {
        User user=new User("Utsav","Chaudhary");
        userServiceImpl.setUser(user);
        User user1 = userServiceImpl.getUser();
        assertEquals(user,user1);
    }

    @Test
    void getFirstName() {
        User user=new User("Utsav","Chaudhary");
        userServiceImpl.setUser(user);
        String getFname=userServiceImpl.getFirstName();
        assertEquals("Utsav",getFname);
    }

    @Test
    void getLastName() {
        User user=new User("Utsav","Chaudhary");
        userServiceImpl.setUser(user);
       String getLname=userServiceImpl.getLastName();
       assertEquals("Chaudhary",getLname);
    }

}