package com.codemaster.okta.restclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemaster.okta.restclient.entity.User;
import com.codemaster.okta.restclient.entity.Jwt.Request;
import com.codemaster.okta.restclient.entity.Jwt.Response;
import com.codemaster.okta.restclient.security.jwt.JwtTokenProvider;
import com.codemaster.okta.restclient.services.UserService;

import static org.springframework.http.ResponseEntity.ok;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UserService service;

    @Autowired
    PasswordEncoder encoder;

    @PostConstruct
    public void saveFirstUser()
    {
        service.saveUser(new User("ubaid", encoder.encode("1234")));
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody Request data) {

        try {
            String username = data.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            String token = jwtTokenProvider.createToken(username, service.findUserByUserName(username).getRoles());

            Response response = new Response(token, username);  
            // Map<Object, Object> model = new HashMap<>();
            // model.put("username", username);
            // model.put("token", token);
            return ok(response);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }
}