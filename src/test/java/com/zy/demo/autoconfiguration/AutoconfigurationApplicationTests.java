package com.zy.demo.autoconfiguration;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
class AutoconfigurationApplicationTests {

    @Autowired
    private HttpClient httpClient;

    /**
     * httpclient bean 的定义
     * 有三种方式都可以让HttpClientAutoConfiguration这个自动配置生效
     * 1.通过将自动配置所在package成为注解了@SpringBootApplication启动类的子package
     * 2.通过定义META-INF/spring.factories文件，里面添加EnableAutoConfiguration与自动配置的映射关系
     * 3.通过在启动类中添加注解EnableHttpClient,EnableHttpClient要@Import(HttpClientAutoConfiguration.class)
     * @return
     */
    @Test
    public void test() throws IOException {
        System.out.println(EntityUtils.toString(httpClient.execute(new HttpGet("https://www.github.com")).getEntity()));
    }

}
