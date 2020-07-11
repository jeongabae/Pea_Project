package com.pea.api.util;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import java.util.Objects;

public class HttpClientUtil {

    private static final int CONNECTION_TIMEOUT = 5000;

    public static String doGet(String url) {
        return getBody(url);
    }
    private static String getBody(String url) {
        return getBody(url, null, null);
    }

    @SuppressWarnings("SameParameterValue")
    private static String getBody(String url, org.apache.commons.httpclient.Cookie[] cookies, Header[] headers) {
        String responseBody = null;
        GetMethod method = null;

        try {
            HttpConnectionManager manager = new SimpleHttpConnectionManager();
            HttpConnectionManagerParams managerParams = new HttpConnectionManagerParams();

            managerParams.setConnectionTimeout(CONNECTION_TIMEOUT);
            managerParams.setSoTimeout(CONNECTION_TIMEOUT);
            manager.setParams(managerParams);

            HttpClient client = new HttpClient(manager);
            if(cookies!=null){
                HttpState initialState = new HttpState();
                initialState.addCookies(cookies);
                client.setState(initialState);
            }

            method = new GetMethod(url);
            method.setFollowRedirects(true);

            if(headers!=null){
                for(Header header : headers){
                    method.setRequestHeader(header);
                }
            }


            int statusCode = client.executeMethod(method);
            if (statusCode == HttpStatus.SC_OK) {
                String charset = method.getResponseCharSet();
                if (charset == null) {
                    charset = "utf-8";
                }
                responseBody = new String(method.getResponseBody(), charset);
            }

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            Objects.requireNonNull(method).releaseConnection();
        }
        return responseBody;

    }
}
