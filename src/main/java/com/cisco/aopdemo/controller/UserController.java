package com.cisco.aopdemo.controller;


import com.cisco.aopdemo.business.UserService;
import com.cisco.aopdemo.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUserService(user);
    }
}
