package org.example.movie.booking.handler;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.example.movie.booking.adapter.KafkaProducerAdapter;
import org.example.movie.booking.event.BookTicketEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class BookingHandler {

    private KafkaProducerAdapter kafkaProducerAdapter;
//    @Value("${kafka.movieBookingApi.checkSeatInventoryTopicName}")
//    private String checkSeatInventoryTopicName;

    @Autowired(required = true)
    public void setKafkaProducerAdapter(KafkaProducerAdapter kafkaProducerAdapter) {
        this.kafkaProducerAdapter = kafkaProducerAdapter;
    }

    @EventHandler
    public void on(BookTicketEvent bookTicketEvent) {
        log.info("Success {}", bookTicketEvent.getUniqueId());
        kafkaProducerAdapter.sendBookingInformationMessage("checkSeatInventory",
                bookTicketEvent.getUniqueId(),
                bookTicketEvent.getBookingInformation());
    }
}