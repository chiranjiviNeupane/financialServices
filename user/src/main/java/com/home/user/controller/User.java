package com.home.user.controller;

import com.home.user.model.UserModel;
import com.home.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class User {


    @Autowired
    private UserService userService;

    @GetMapping("/check")
    public String check(){
        return "Success";
    }

    @PostMapping("/")
    public UserModel saveUser(@RequestBody UserModel user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserModel getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("user id");
        return userService.getUserWithId(userId);
    }

}
