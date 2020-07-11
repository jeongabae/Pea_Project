package com.pea.api.daily.aggregate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NormalCount {
    private int releaseCount;
    private int negativeCount;

    public NormalCount(int negativeCount, int releaseCount) {
        this.negativeCount = negativeCount;
        this.releaseCount = releaseCount;
    }
}
