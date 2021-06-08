package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response;

import java.util.List;

public class Album {
    private List<Artist> artists;

    public List<Artist> getArtists() { return artists; }
    public void setArtists(List<Artist> value) { this.artists = value; }
}
