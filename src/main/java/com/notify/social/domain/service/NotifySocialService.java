package com.notify.social.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotifySocialService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendNotification(String socialGuid) {

        kafkaTemplate.send("social-notification-topic", socialGuid);

        log.info("Sending notification for socialGuid: {}", socialGuid);
    }
}
