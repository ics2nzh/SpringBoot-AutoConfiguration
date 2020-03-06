package com.zy.demo.autoconfiguration.controller;

import com.zy.demo.autoconfiguration.util.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RequestController {
    @Autowired
    private HttpClientUtils httpClientUtils;

    @GetMapping("/get")
    public String test(@RequestParam("key") String key) throws IOException {
        String data = httpClientUtils.execute(key);
        return data;
    }
}
