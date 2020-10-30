package com.pea.api.hospital;

import com.pea.api.common.Constants;
import com.pea.api.common.ServiceOperation;
import com.pea.api.util.CsvParserUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HospitalOperation implements ServiceOperation {

    HospitalOperation() {
        create();
    }

    @Override
    public void create() {
        try {
            createHospitalData(CsvParserUtils.parser(Constants.RequestUrl.COVID_HOSPITAL));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createHospitalData(List<String> csvHospitals) {
        List<Hospital> hospitals = new ArrayList<>();

        for(String hospital : csvHospitals) {
            System.out.println("Hospital :: " + hospital);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
