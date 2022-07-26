package org.example.movie.booking.adapter;

import lombok.AllArgsConstructor;
import org.example.movie.core.common.BookingInformation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class KafkaProducerAdapter {

    private final KafkaTemplate<String, BookingInformation> kafkaTemplate;

    public void sendBookingInformationMessage(String topicName, String uniqueId, BookingInformation message) {

        kafkaTemplate.send(topicName, uniqueId, message);
    }

}
