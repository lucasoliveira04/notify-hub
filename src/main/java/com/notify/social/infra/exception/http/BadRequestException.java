package com.notify.social.infra.exception.http;

import org.springframework.http.HttpStatus;

public class BadRequestException extends HttpExceptionBase {

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }

    /**
     * Kept for compatibility with callers that provide the status explicitly.
     */
    public BadRequestException(String message, HttpStatus status) {
        super(message, status);
    }
}
