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

    public  String execute(String key) throws IOException {
        String url = GetUrlUtil.get(key);
        if ("fail".equalsIgnoreCase(url)){
            return "请求的URL不存在...";
        }
        String s = EntityUtils.toString(httpClient.execute(new HttpGet(url)).getEntity(),"UTF-8");
        return s;
    }
}
