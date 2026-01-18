package com.vishvas.kafka.kafka_backend.producer;

import com.vishvas.kafka.kafka_backend.model.UserEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserEventProducer {

    private static final String TOPIC = "user-events";
    private final KafkaTemplate<String, UserEvent> kafkaTemplate;

    public void send(UserEvent event) {
        kafkaTemplate.send(TOPIC, event.getUserId(), event);
    }
}
