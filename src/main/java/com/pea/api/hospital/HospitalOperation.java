package com.pea.api.hospital;

import com.pea.api.common.Constants;
import com.pea.api.common.CsvParsable;
import com.pea.api.common.ServiceOperation;

public class HospitalOperation implements ServiceOperation {

    HospitalOperation() {
        create();
    }

    @Override
    public void create() {
        CsvParsable csvParser = new HospitalCsvParser();
        csvParser.parse(Constants.RequestUrl.COVID_HOSPITAL);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
