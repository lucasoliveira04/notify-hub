package com.notify.social.infra.exception.http;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class HttpExceptionBase extends RuntimeException {

    private final HttpStatus status;

    protected HttpExceptionBase(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
