package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public final static String TOPIC = "javaguides-string";
    public final static String TOPIC_JSON = "javaguides_json";

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(TOPIC).partitions(1).build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name(TOPIC_JSON).partitions(1).build();
    }

}
