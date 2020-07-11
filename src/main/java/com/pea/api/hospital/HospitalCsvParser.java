package com.pea.api.hospital;

import com.pea.api.common.CsvParsable;
import com.pea.api.util.HttpClientUtil;

public class HospitalCsvParser implements CsvParsable {
    @Override
    public String[] parse(String url) {
        String response = HttpClientUtil.doGet(url);

        System.out.println("Response Hospital :" + response);


        return response.split(",");
    }
}
