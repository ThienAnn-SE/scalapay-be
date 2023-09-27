package com.demo.thienanse.config.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ApiException withMessage(String message){
        this.message = message;
        return this;
    }

    public ApiException(HttpStatus status){
        this.status = status;
    }
}
