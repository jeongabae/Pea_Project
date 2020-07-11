package com.pea.api.daily;

import com.pea.api.common.Constants;
import com.pea.api.common.CsvParsable;
import com.pea.api.common.ServiceOperation;

public class DailyOperation implements ServiceOperation {

    DailyOperation() {
        create();
    }

    @Override
    public void create() {
        CsvParsable dailyPareser = new DailyCsvParser();
        dailyPareser.parse(Constants.RequestUrl.COVID_DAILY);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
