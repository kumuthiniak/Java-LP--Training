package com.example.kafkaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

public class Producer {

    @Autowired
    private KafkaTemplate<String ,String > kafkaTemplate;
    public void sendMessage(String message)
    {
        this.kafkaTemplate.send(TOPIC,message);
    }
}
