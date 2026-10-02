package com.notify.social.domain.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ApiHealthResponse(
        String status,
        String message,
        LocalDateTime timestamp
) {
}
