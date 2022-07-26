package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieScheduleRequest {
  private String movieCityMappingId;
  private String scheduleDate;
  private List<String> movieCityMappingIdList;
}
