package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response;

import java.util.List;

public class SpotifyPlaylistResponse {
    private List<Item> items;

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> value) { this.items = value; }
}
