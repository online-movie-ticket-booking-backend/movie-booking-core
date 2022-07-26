package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieDetailsListResponse {
    private List<MovieDetails> movieDetailsList;
    private Map<String, MovieDetails> movieDetailsMap;
}
