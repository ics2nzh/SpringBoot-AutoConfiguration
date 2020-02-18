package com.zy.demo.autoconfiguration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.httpclient")
public class HttpClientProperties {

    //  连接超时时间
    private Integer connMaxTimeOut = 1000;
    //  socket连接超时时间
    private Integer socketTimeOut = 10000;

    private String agent = "agent";
//    单个ip最大连接数
    private Integer maxConnPerRoute = 10;
//    总的连接数
    private Integer maxConnTotal = 50;


    public Integer getConnMaxTimeOut() {
        return connMaxTimeOut;
    }

    public void setConnMaxTimeOut(Integer connMaxTimeOut) {
        this.connMaxTimeOut = connMaxTimeOut;
    }

    public Integer getSocketTimeOut() {
        return socketTimeOut;
    }

    public void setSocketTimeOut(Integer socketTimeOut) {
        this.socketTimeOut = socketTimeOut;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getMaxConnPerRoute() {
        return maxConnPerRoute;
    }

    public void setMaxConnPerRoute(Integer maxConnPerRoute) {
        this.maxConnPerRoute = maxConnPerRoute;
    }

    public Integer getMaxConnTotaol() {
        return maxConnTotal;
    }

    public void setMaxConnTotaol(Integer maxConnTotaol) {
        this.maxConnTotal = maxConnTotaol;
    }
}
