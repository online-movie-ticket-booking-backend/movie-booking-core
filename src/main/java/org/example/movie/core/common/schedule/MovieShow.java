package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieShow {
    private String showtime;
    private int seatCount;
}
