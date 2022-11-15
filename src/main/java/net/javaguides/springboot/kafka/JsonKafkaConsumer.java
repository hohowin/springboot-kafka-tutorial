package net.javaguides.springboot.kafka;

import net.javaguides.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static net.javaguides.springboot.config.KafkaTopicConfig.TOPIC_JSON;

@Service
public class JsonKafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = TOPIC_JSON, groupId = "group_id")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
