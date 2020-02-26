package com.codemaster.okta.authusersservice.services;

import com.codemaster.okta.authusersservice.entity.User;

public interface UserService 
{
    public User getUserByUsername(String username);
    public User saveUser(String username, String password);
}