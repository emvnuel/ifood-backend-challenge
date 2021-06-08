package io.emvnuel.github.ifoodbackendchallenge.service;

public interface GenreSuggestionService {

    String getMusicGenre();
    boolean isTemperatureSuitableToMusicGenre(Double temperature);
}

