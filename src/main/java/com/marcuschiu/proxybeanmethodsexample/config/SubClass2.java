package com.marcuschiu.proxybeanmethodsexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubClass2 extends ClientConfiguration {

    @Bean
    public RestTemplate subClass2RestTemplate() {
        return getRestTemplate("sub-class-2");
    }
}
