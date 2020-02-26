package com.codemaster.okta.restclient.security;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService
{

    @Autowired
    UserService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = service.findUserByUserName(username);
        if (user != null)
        {
            return user;
        }
        else
        {
            throw new UsernameNotFoundException("User not found: " + username);
        }
    }
}
