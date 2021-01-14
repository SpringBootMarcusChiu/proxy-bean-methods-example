package com.marcuschiu.proxybeanmethodsexample.config;

public class ClientConfiguration {

    public RestTemplate getRestTemplate(String state) {
        return new RestTemplate(state);
    }
}
