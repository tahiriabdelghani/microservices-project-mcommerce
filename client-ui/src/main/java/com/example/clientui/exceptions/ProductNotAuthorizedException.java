package com.example.clientui.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ProductNotAuthorizedException extends RuntimeException {
    public ProductNotAuthorizedException(String msg) {
        super(msg);
    }
}
