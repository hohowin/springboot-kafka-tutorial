package net.javaguides.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static net.javaguides.springboot.config.KafkaTopicConfig.TOPIC;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = TOPIC, groupId = "group_id")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
