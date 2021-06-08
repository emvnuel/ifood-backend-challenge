package io.emvnuel.github.ifoodbackendchallenge.shared;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class QueryAuthenticationInterceptor implements RequestInterceptor {

    private final String param;
    private final String value;

    public QueryAuthenticationInterceptor(String param, String value) {
        this.param = param;
        this.value = value;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.query(param, value);

    }
}
