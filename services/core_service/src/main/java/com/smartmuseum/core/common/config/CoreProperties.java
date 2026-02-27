package com.smartmuseum.core.common.config;

import java.net.http.WebSocket;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "core")
public class CoreProperties {
    private final WebSocket websocket= new WebSocket();
    private final Positioning positioning = new Positioning();

    public WebSocket getWebSocket(){return websocket;}
    public Positioning getPositioning() {return positioning;}

    public static class WebSocket{
        private String path ="/ws";

        public String gethPath() {return path;}
        public void setPath(String path) {this.path = path;}
    }


    public static class Positioning {
        private String baseUrl;
        private String endpoint;
        private int timeoutMs = 1500;
        
        public String getBaseUrl() {return baseUrl;}
        public void setBaseUrl(String baseUrl) {this.baseUrl = baseUrl;}

        public String getEndpoint(){return endpoint;}
        public void setEndpoint(String endpoint) {this.endpoint = endpoint;}

        public int getTimeoutMs(){return timeoutMs;}
        public void setTimeoutMs(int timeoutMs){this.timeoutMs = timeoutMs;}
    }

}
