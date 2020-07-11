package com.pea.api.daily;

import com.pea.api.common.CsvParsable;
import com.pea.api.util.HttpClientUtil;

public class DailyRegionCsvParser implements CsvParsable {
    @Override
    public String[] parse(String url) {
        String response = HttpClientUtil.doGet(url);

        System.out.println("Response Daily Region COVID-19 :" + response);

        return response.split(",");
    }
}
