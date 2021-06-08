package io.emvnuel.github.ifoodbackendchallenge.shared;

import feign.Retryer;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 8000, 3);
    }
}
