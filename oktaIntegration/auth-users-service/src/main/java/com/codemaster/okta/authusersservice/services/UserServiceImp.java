package com.codemaster.okta.authusersservice.services;

import com.codemaster.okta.authusersservice.entity.User;
import com.codemaster.okta.authusersservice.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService
{

    @Autowired
    UserRepo repo;

    @Override
    public User getUserByUsername(String username)
    {
        return repo.getUserByName(username);
    }

    @Override
    public User saveUser(String username, String password) {
        return repo.save(new User(username, password));
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }
    
}