package org.example.movie.core.common.booking;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@EqualsAndHashCode
@Data(staticConstructor = "of")
@Accessors(chain = true)
public class BookingInformation {
    private String theatreId;
    private String movieId;
    private String cityId;
    private String userUniqueIdentification;
    private LocalDateTime movieDateTime;
    private String scheduleUniqueId;
    private int numberOfSeat;
    private int totalNoOfSeat;
    private PricingRequest pricingRequest;
}
