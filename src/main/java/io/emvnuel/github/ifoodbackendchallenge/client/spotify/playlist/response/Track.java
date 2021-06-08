package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response;

import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response.Album;

public class Track {
    private Album album;
    private String name;

    public Album getAlbum() { return album; }
    public void setAlbum(Album value) { this.album = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}
