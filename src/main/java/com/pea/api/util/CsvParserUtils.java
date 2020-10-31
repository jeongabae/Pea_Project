package com.pea.api.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvParserUtils {

    public static List<String> parser(String url) throws IOException {
        List<String> list = new ArrayList<>();

        String response = HttpClientUtil.doGet(url);

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(response.getBytes())));

        String input;
        br.readLine(); //first line excepted because is title

        while((input = br.readLine()) != null) {
            list.add(input);
        }

        return list;
    }
}
