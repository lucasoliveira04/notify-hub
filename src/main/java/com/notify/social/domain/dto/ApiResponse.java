package com.notify.social.domain.dto;

import java.time.LocalDateTime;

public record ApiResponse(
        String status,
        String message,
        Object data,
        LocalDateTime timestamp) {
    public static ApiResponse response_success(String status, String message, Object data, LocalDateTime timestamp) {
        return new ApiResponse("success", message, data, timestamp);
    }

    public static ApiResponse response_failure(String status, String message, LocalDateTime timestamp) {
        return new ApiResponse("failure", message, null, timestamp);
    }
}
