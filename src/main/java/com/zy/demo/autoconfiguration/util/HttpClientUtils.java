package com.zy.demo.autoconfiguration.util;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class  HttpClientUtils {

    @Autowired
    private  HttpClient httpClient;

    public  String execute() throws IOException {
        String s = EntityUtils.toString(httpClient.execute(new HttpGet("http://www.taobao.com")).getEntity());
        return s;
    }
}
