package org.example.movie.core.common.schedule;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data(staticConstructor = "of")
@Accessors(chain = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TheatreDetails {
    private String theatreName;
    @EqualsAndHashCode.Include
    private String theatreUniqueId;
}
