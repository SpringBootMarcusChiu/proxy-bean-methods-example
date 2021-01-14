package com.marcuschiu.proxybeanmethodsexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubClass1 extends ClientConfiguration {

    @Bean
    public RestTemplate subClass1RestTemplate() {
        return getRestTemplate("sub-class-1");
    }
}
