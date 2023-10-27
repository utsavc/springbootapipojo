package com.buildtmwlearning.springbootapipojo.restcontrollers;


import com.buildtmwlearning.springbootapipojo.entities.User;
import com.buildtmwlearning.springbootapipojo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(value = "UserController", description = "This particular Controller is related to Student Component")
@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }


    @ApiOperation(value = "Post user object", response = User.class, tags = "postUser")
    @PostMapping(value = "/inputdata")
    public String putData(@RequestBody User user){
        userService.setUser(user);
        return "Success";
    }

    @ApiOperation(value = "Get user object", response = User.class, tags = "getUser")
    @GetMapping("/retrieve")
    public User retrieve(){
        return userService.getUser();
    }


    @ApiOperation(value = "Get first Name", response = User.class, tags = "getFirstName")
    @GetMapping("/firstName")
    public String getFirstNameController(){

        return  userService.getFirstName();
    }


    @ApiOperation(value = "Get Last Name", response = User.class, tags = "getLastName")
    @GetMapping("/lastName")
    public String getLastNameController(){

        return  userService.getLastName();
    }


}
