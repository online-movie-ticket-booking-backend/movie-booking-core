package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieDetailsResponse {
    private String movieUniqueKey;
    private String movieName;
    private String movieRunTime;
    private String movieReleaseDate;
    private String movieCertificationType;
    private String language;
    private String genre;
    private String movieCityIdMapping;
}
