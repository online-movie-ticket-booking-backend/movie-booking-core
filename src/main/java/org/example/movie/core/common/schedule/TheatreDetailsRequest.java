package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class TheatreDetailsRequest {
    private String theatreUniqueId;
    private List<String> theatreUniqueIdList;
}
