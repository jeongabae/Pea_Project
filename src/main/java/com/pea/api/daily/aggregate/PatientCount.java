package com.pea.api.daily.aggregate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PatientCount {
    private int confirmedCount;
    private int deathCount;

    public PatientCount(int confirmedCount, int deathCount) {
        this.confirmedCount = confirmedCount;
        this.deathCount = deathCount;
    }

    public PatientCount() {
        this.confirmedCount = 0;
        this.deathCount = 0;
    }
}
