package com.zy.demo.autoconfiguration.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class  HttpClientUtils {

    @Autowired
    private  HttpClient httpClient;

    private CloseableHttpResponse response = null;

    public  String execute(String key) throws IOException {
        String responseEntity = null;
        try{
            String url = GetUrlUtil.get(key);
            if ("fail".equalsIgnoreCase(url)){
                return "请求的URL不存在...";
            }
            response  = (CloseableHttpResponse) httpClient.execute(new HttpGet(url));
            responseEntity = EntityUtils.toString(response.getEntity(),"UTF-8");
        }finally {
            response.close();
        }
        return responseEntity;
    }
}
