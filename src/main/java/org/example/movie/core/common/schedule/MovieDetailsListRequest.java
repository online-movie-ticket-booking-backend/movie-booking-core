package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class MovieDetailsListRequest {
  private List<String> movieUniqueIdList;
}
