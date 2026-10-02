package com.notify.social.controller;

import com.notify.social.domain.dto.ApiHealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public ResponseEntity<ApiHealthResponse> healthCheck() {
        return ResponseEntity.ok(ApiHealthResponse.builder()
                .status("UP")
                .message("API is running")
                .timestamp(java.time.LocalDateTime.now())
                .build());
    }
}
