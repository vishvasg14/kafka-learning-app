package com.vishvas.kafka.kafka_backend.consumer;

import com.vishvas.kafka.kafka_backend.model.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserEventConsumer {

    @KafkaListener(topics = "user-events", groupId = "user-activity-group")
    public void consume(UserEvent event) {
        System.out.println("Consumed event from Kafka: {}"+ event);
    }
}
