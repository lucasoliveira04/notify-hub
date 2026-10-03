package com.notify.social.domain.listenner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotifySocialListener {

    @KafkaListener(topics = "social-notification-topic", groupId = "social-notification-group")
    public void listen(String socialGuid) {
        log.info("Received notification for socialGuid: {}", socialGuid);
    }

}
