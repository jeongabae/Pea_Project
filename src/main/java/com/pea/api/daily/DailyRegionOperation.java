package com.pea.api.daily;

import com.pea.api.common.Constants;
import com.pea.api.common.ServiceOperation;
import com.pea.api.daily.aggregate.PatientCount;
import com.pea.api.daily.aggregate.RegionCount;
import com.pea.api.util.CsvParserUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DailyRegionOperation implements ServiceOperation {
    DailyRegionOperation() {
        create();
    }

    @Override
    public void create() {
        try {
            createDailyRegions(CsvParserUtils.parser(Constants.RequestUrl.COVID_DAILY_REGION));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDailyRegions(List<String> csvList) {
        List<DailyRegion> list = new ArrayList<>();

        for(String csv : csvList) {
            String[] array = csv.split(",");
            String date = array[0];
            String region = array[1];
            RegionCount regionCount = RegionCount
                    .builder()
                    .patientCount(new PatientCount(Integer.parseInt(array[2]), Integer.parseInt(array[3])))
                    .releasedCount(Integer.parseInt(array[4]))
                    .build();

            DailyRegion dailyRegion = new DailyRegion(date, region, regionCount);

            list.add(dailyRegion);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
