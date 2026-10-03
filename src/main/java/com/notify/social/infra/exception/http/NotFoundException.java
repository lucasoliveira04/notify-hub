package com.notify.social.infra.exception.http;

import org.springframework.http.HttpStatus;

public class NotFoundException extends HttpExceptionBase {

    public NotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }

    /**
     * Kept for compatibility with callers that provide the status explicitly.
     */
    public NotFoundException(String message, HttpStatus status) {
        super(message, status);
    }
}
