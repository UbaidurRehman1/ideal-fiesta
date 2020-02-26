package com.codemaster.okta.restclient.services;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.proxy.OpenFeignProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService
{

    @Autowired
    OpenFeignProxy proxy;

    @Override
    public User findUserByUserName(String username)
    {
        return proxy.getUser(username);
    }

    @Override
    public void saveUser(User user) {
        proxy.saveUser(user);
    }
    
}