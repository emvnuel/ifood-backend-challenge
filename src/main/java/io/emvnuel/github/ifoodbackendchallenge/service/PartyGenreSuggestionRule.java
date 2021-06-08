package io.emvnuel.github.ifoodbackendchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class PartyGenreSuggestionRule implements GenreSuggestionService {

    @Override
    public String getMusicGenre() {
        return "Party";
    }

    @Override
    public boolean isTemperatureSuitableToMusicGenre(Double temperature) {
        return temperature.intValue() > 30;
    }

}
