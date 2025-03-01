package com.krillinator.ws_lektion_9_consume_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WeatherWebClientConfig {

    @Bean
    public WebClient.Builder weatherWebClientBuilder() {
        return WebClient.builder();
    }

}
