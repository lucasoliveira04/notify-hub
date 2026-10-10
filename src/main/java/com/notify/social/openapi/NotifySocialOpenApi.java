package com.notify.social.openapi;

import com.notify.social.domain.dto.notify.NotifySocialResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface NotifySocialOpenApi {

    @Operation(summary = "Dispara uma notificação social")
    @Parameter(name = "socialGuid", description = "Identificador da rede social", required = true)
    @Tag(name = "Notificações sociais", description = "Disparo de notificações para redes sociais")
    ResponseEntity<NotifySocialResponse> getNotifySocial(String socialGuid);
}
