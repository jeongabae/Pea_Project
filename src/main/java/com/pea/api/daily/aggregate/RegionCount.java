package com.pea.api.daily.aggregate;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class RegionCount {
    private final PatientCount patientCount;
    private final int releasedCount;
}
