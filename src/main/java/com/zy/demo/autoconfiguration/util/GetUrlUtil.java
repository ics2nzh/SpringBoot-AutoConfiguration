package com.zy.demo.autoconfiguration.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetUrlUtil {
    private static Properties pro;
    static{
        try {
            InputStream is = GetUrlUtil.class.getClassLoader().getResourceAsStream("url.properties");
            pro = new Properties();
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String get(String key){
        String targetUrl=null;
        if("baidu".equalsIgnoreCase(key)) {
            targetUrl = (String)pro.get("url.baidu");
            return targetUrl;
        }else if ("sina".equalsIgnoreCase(key)){
            targetUrl = (String)pro.get("url.sina");
            return targetUrl;
        }else if ("163".equalsIgnoreCase(key)){
            targetUrl = (String)pro.get("url.163");
            return targetUrl;
        }
        return "fail";
    }
}
