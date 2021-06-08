package io.emvnuel.github.ifoodbackendchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class RockGenreSuggestionRule implements GenreSuggestionService {

    @Override
    public String getMusicGenre() {
        return "Rock";
    }

    @Override
    public boolean isTemperatureSuitableToMusicGenre(Double temperature) {
        return temperature.intValue() >= 10 && temperature.intValue() <= 14;
    }

}
