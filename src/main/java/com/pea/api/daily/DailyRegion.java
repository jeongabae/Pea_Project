/*
date	region	confirmed	death	released
 */
package com.pea.api.daily;

import com.pea.api.daily.aggregate.RegionCount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class DailyRegion {
    private String date;
    private RegionCount regionCount;
    private String region;

    public DailyRegion(String date, String region, RegionCount regionCount) {
        this.date = date;
        this.region = region;
        this.regionCount = regionCount;
    }
}


