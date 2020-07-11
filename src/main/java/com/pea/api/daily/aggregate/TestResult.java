package com.pea.api.daily.aggregate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TestResult {
    private int testedCount;
    private PatientCount patientCount;
    private NormalCount normalCount;

    public TestResult(int testedCount, PatientCount patientCount, NormalCount normalCount) {
        this.testedCount = testedCount;
        this.patientCount = patientCount;
        this.normalCount = normalCount;
    }
}
