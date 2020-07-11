/*
date	region	confirmed	death	released
 */
package com.pea.api.daily;

import com.pea.api.daily.aggregate.RegionCount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
@NoArgsConstructor
public class DailyRegion {
    private int date;
    private RegionCount regionCount;
    private String region;
    private Map<String, Integer> regionMap = new HashMap<>();

    public DailyRegion(int date, String region, RegionCount regionCount) {
        this.date = date;
        this.region = region;
        this.regionCount = regionCount;
    }
}


