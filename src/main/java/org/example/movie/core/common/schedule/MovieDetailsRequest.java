package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieDetailsRequest {
    private String movieUniqueId;
}
