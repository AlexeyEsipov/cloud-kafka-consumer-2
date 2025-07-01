package ru.job4j.kafkaconcumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topicPattern = "${topic.name}")
    private void listener(String message) {
        log.info("from Kafka : {}", message);
    }
}
