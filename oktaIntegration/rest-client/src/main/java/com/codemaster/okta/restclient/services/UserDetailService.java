package com.codemaster.okta.restclient.services;

import java.util.ArrayList;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.proxy.OpenFeignProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService {

    @Autowired 
    OpenFeignProxy proxy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = proxy.getUser(username);
        if (user != null)
        {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
        }
        else
        {
            throw new UsernameNotFoundException("The user " + username + " is not found");
        }
    }
    
}