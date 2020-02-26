package com.codemaster.okta.restclient.services;

import com.codemaster.okta.restclient.entity.User;

public interface UserService 
{
    public User findUserByUserName(String username);
    public void saveUser(User user);
    public void deleteAll();
}