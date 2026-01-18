package com.vishvas.kafka.kafka_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishvas.kafka.kafka_backend.service.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
@CrossOrigin("*")
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public String publish(@RequestBody String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka";
    }
}

