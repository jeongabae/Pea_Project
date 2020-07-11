package com.pea.api.daily.aggregate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegionCount {
    private PatientCount patientCount;
    private int releasedCount;

    public RegionCount(PatientCount patientCount, int releasedCount) {
        this.patientCount = patientCount;
        this.releasedCount = releasedCount;
    }

    public RegionCount() {
        this.patientCount = new PatientCount();
        this.releasedCount = 0;
    }
}
