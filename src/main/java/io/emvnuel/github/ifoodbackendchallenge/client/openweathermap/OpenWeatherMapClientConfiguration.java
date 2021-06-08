package io.emvnuel.github.ifoodbackendchallenge.client.openweathermap;

import feign.Logger;
import io.emvnuel.github.ifoodbackendchallenge.shared.QueryAuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class OpenWeatherMapClientConfiguration {

    private final String secret;

    public OpenWeatherMapClientConfiguration(@Value("${open-weather-maps.api.key}") String secret) {
        this.secret = secret;
    }

    @Bean
    public QueryAuthenticationInterceptor queryAuthenticationInterceptor() {
     return new QueryAuthenticationInterceptor("appid", secret);
    }

    @Bean
    public Logger.Level openWeatherMapFeignLoggerLevel() {
        return Logger.Level.HEADERS;
    }
}
