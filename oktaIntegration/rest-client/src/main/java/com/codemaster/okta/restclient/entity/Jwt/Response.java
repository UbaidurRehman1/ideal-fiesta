package com.codemaster.okta.restclient.entity.Jwt;

import java.io.Serializable;

public class Response implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;

    private String token;
    private String username;


    public Response(String token, String username)
    {
        this.token = token;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}