package com.pea.api.daily;

import com.pea.api.common.Constants;
import com.pea.api.common.ServiceOperation;
import com.pea.api.util.CsvParserUtils;

import java.io.IOException;

public class DailyOperation implements ServiceOperation {

    DailyOperation() {
        create();
    }

    @Override
    public void create() {
        try {
            CsvParserUtils.parser(Constants.RequestUrl.COVID_DAILY);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
