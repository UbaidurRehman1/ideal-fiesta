package com.okta.springboottokenauth;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(java.security.Principal user)
    {
        return "Hello " + user.getName();
    }

    @GetMapping("/group")
    public Map<String, Object> token(java.security.Principal principal)
    {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;
        return (Map<String, Object>) authentication.getUserAuthentication().getDetails();
    }

}