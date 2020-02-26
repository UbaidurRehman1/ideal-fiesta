package com.codemaster.okta.restclient.services;

import java.util.ArrayList;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.proxy.OpenFeignProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired 
    OpenFeignProxy proxy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = proxy.getUser(username);
        if (user != null)
        {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", new ArrayList<>());
        }
        else
        {
            throw new UsernameNotFoundException("The user " + username + " is not found");
        }
    }
    
}