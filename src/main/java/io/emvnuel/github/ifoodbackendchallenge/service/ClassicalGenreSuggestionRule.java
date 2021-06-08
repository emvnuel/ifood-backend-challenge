package io.emvnuel.github.ifoodbackendchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class ClassicalGenreSuggestionRule implements GenreSuggestionService {

    @Override
    public String getMusicGenre() {
        return "Classical";
    }

    @Override
    public boolean isTemperatureSuitableToMusicGenre(Double temperature) {
        return temperature.intValue() < 10;
    }
}
