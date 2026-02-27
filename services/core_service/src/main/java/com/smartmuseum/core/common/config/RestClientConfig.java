package com.smartmuseum.core.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@EnableConfigurationProperties(CoreProperties.class)
public class RestClientConfig {
    
    @Bean
    public RestClient restClient(RestClient.Builder builder){
        return builder.build();
    }
}
