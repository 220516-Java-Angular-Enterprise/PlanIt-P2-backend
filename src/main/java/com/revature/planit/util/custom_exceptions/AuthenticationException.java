package com.revature.planit.util.custom_exceptions;

public class AuthenticationException extends RuntimeException{
    public AuthenticationException() {
        super();
    }

    public AuthenticationException(String message) {
        super(message);
    }
}
