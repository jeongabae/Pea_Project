package com.pea.api.daily;

import com.pea.api.common.Constants;
import com.pea.api.common.CsvParsable;
import com.pea.api.common.ServiceOperation;

public class DailyRegionOperation implements ServiceOperation {

    DailyRegionOperation() {
        create();
    }

    @Override
    public void create() {
        CsvParsable csvParser = new DailyRegionCsvParser();

        csvParser.parse(Constants.RequestUrl.COVID_DAILY_REGION);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
