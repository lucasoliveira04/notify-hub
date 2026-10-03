package com.notify.social.controller;

import com.notify.social.domain.dto.notify.NotifySocialResponse;
import com.notify.social.domain.service.NotifySocialService;
import com.notify.social.infra.exception.http.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notify/social")
@RequiredArgsConstructor
public class NotifySocialController {

    private final NotifySocialService notifySocialService;

    @GetMapping("/notify/{socialGuid}")
    public ResponseEntity<NotifySocialResponse> getNotifySocial(@PathVariable String socialGuid) {
        if (socialGuid.isBlank()) {
            throw new BadRequestException("socialGuid must not be blank");
        }

        notifySocialService.sendNotification(socialGuid);
        return ResponseEntity.ok(NotifySocialResponse.success("Notification sent successfully"));
    }
}
