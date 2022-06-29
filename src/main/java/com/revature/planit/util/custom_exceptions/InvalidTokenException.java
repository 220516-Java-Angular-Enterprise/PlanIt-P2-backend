package com.revature.planit.util.custom_exceptions;

public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException(){super();}
    public InvalidTokenException(String message) {
        super(message);
    }
}
