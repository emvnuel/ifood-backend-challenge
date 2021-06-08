package io.emvnuel.github.ifoodbackendchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class PopGenreSuggestionRule implements GenreSuggestionService {

    @Override
    public String getMusicGenre() {
        return "Pop";
    }

    @Override
    public boolean isTemperatureSuitableToMusicGenre(Double temperature) {
        return temperature.intValue() >= 15 && temperature.intValue() <= 30;
    }

}
