package com.codemaster.okta.restclient.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @RequestMapping("/")
    public String home(java.security.Principal user)
    {
        return "Hello " + user.getName();
    }

}