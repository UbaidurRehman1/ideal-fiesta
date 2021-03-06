package com.codemaster.okta.authusersservice.controller;


import com.codemaster.okta.authusersservice.entity.User;
import com.codemaster.okta.authusersservice.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    UserService service;

    @GetMapping("/users/{userName}")
    public User getUser(@PathVariable("userName") String username)
    {
        return service.getUserByUsername(username);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user)
    {
        service.saveUser(user.getUsername(), user.getPassword());
    }

    @DeleteMapping("/users")
    public void deleteAll()
    {
        service.deleteAll();
    }
} 
