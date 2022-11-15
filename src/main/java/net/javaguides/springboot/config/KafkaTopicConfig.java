package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static net.javaguides.springboot.SpringbootKafkaTutorialApplication.TOPIC;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(TOPIC).partitions(1).build();
    }
}
