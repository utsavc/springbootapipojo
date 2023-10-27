package com.buildtmwlearning.springbootapipojo.restcontrollers;

import com.buildtmwlearning.springbootapipojo.entities.User;
import com.buildtmwlearning.springbootapipojo.service.UserService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllersTest {

    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    User user;

    @Before
    public  void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void putDataTest() {
        user=new User("John","Snow");
        String msg=userController.putData(user);
        assertEquals("Success",msg);
    }

    @Test
    void retrieveTest() {
        user=new User("John","Snow");
        when(userController.retrieve()).thenReturn(user);
        User user1= userController.retrieve();
        assertEquals(user,user1);
    }

    @Test
    void getFirstNameTest() {
        user=new User("John","Snow");
        when(userService.getFirstName()).thenReturn(user.getFirstName());
        String fname=userController.getFirstNameController();
        assertEquals("John",fname);
    }

    @Test
    void getLastNameTest() {
        user=new User("John","Snow");
        when(userService.getLastName()).thenReturn(user.getLastName());
        String lname= userController.getLastNameController();
        assertEquals("Snow",lname);
    }
}