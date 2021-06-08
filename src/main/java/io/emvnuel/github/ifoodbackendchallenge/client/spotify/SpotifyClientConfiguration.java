package io.emvnuel.github.ifoodbackendchallenge.client.spotify;

import feign.Logger;
import io.emvnuel.github.ifoodbackendchallenge.shared.HeaderAuthenticationInterceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class SpotifyClientConfiguration {

    private final String secret;

    public SpotifyClientConfiguration(@Value("${spotify.api.key}") String secret) {
        this.secret = secret;
    }

    @Bean
    public HeaderAuthenticationInterceptor headerAuthenticationInterceptor() {
        return new HeaderAuthenticationInterceptor(secret);
    }

    @Bean
    public Logger.Level spotifyFeignLoggerLevel() {
        return Logger.Level.HEADERS;
    }
}
