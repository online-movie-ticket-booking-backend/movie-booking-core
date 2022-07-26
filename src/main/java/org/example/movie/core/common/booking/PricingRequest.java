package org.example.movie.core.common.booking;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class PricingRequest {
    private int seat;
    private String userIdentification;
    private String scheduleUniqueId;
    private float totalPrice;
    private String pricingUniqueId;
}
