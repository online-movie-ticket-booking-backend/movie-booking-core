package org.example.movie.booking.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Value("${kafka.movieBookingApi.checkSeatInventoryTopicName}")
    private String checkSeatInventoryTopicName;


    @Bean
    public NewTopic topicCheckSeatInventory() {
        return TopicBuilder.name(checkSeatInventoryTopicName).build();
    }
}