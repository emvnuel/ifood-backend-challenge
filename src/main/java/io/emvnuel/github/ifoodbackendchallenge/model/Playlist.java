package io.emvnuel.github.ifoodbackendchallenge.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private String musicGenre;
    private List<String> songs = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String name, String musicGenre, List<String> songs) {
        this.name = name;
        this.musicGenre = musicGenre;
        this.songs = songs;
    }

    public List<String> getSongs() {
        return songs;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public String getName() {
        return name;
    }
}
