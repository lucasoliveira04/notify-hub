package com.notify.social.openapi;

import com.notify.social.domain.dto.ApiHealthResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface ApiOpenApi {

    @Operation(summary = "Verifica a saúde da API")
    @Tag(name = "API", description = "Operações gerais da API")
    ResponseEntity<ApiHealthResponse> healthCheck();
}
