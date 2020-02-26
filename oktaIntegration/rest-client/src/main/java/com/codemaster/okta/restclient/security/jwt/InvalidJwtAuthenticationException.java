package com.codemaster.okta.restclient.security.jwt;

import org.springframework.security.core.AuthenticationException;

public class InvalidJwtAuthenticationException extends AuthenticationException {

	private static final long serialVersionUID = -4528687162472435842L;

	public InvalidJwtAuthenticationException(String e) {
        super(e);
    }
}
