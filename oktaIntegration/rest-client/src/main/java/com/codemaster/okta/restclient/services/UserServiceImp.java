package com.codemaster.okta.restclient.services;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService
{
    private UserRepo userRepo;

    public UserServiceImp(@Autowired UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }



    @Override
    public User findUserByUserName(String username)
    {
        return userRepo.getUserByName(username);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteAll()
    {
        userRepo.deleteAll();
    }
    
}