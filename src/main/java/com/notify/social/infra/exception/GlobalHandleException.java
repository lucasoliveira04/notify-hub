package com.notify.social.infra.exception;

import com.notify.social.domain.dto.ApiResponse;
import com.notify.social.infra.exception.http.HttpExceptionBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler(HttpExceptionBase.class)
    public ResponseEntity<ApiResponse> handleHttpException(HttpExceptionBase exception) {
        var response = ApiResponse.response_failure(
                "failure",
                exception.getMessage(),
                LocalDateTime.now()
        );

        return ResponseEntity
                .status(exception.getStatus())
                .body(response);
    }
}
