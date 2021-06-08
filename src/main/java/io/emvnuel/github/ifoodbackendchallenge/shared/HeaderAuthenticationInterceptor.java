package io.emvnuel.github.ifoodbackendchallenge.shared;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class HeaderAuthenticationInterceptor implements RequestInterceptor {

    private final String token;

    public HeaderAuthenticationInterceptor(String token) {
        this.token = token;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Authorization", "Bearer "+token);

    }
}
