package com.zy.demo.autoconfiguration;

import com.zy.demo.autoconfiguration.config.EnableHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableHttpClient
public class AutoconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoconfigurationApplication.class, args);
    }

}
