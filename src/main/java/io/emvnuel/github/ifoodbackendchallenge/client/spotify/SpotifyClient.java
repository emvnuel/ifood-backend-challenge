package io.emvnuel.github.ifoodbackendchallenge.client.spotify;

import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response.SpotifyPlaylistResponse;
import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response.SpotifyPlaylistsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${spotify.api.url}", name = "spotify", configuration = SpotifyClientConfiguration.class)
public interface SpotifyClient {

    @GetMapping(value = "/search?type=playlist&limit=1&q={musicGenre}")
    SpotifyPlaylistsResponse findPlaylistsByMusicGenre(@PathVariable("musicGenre") String musicGenre);

    @GetMapping(value = "/playlists/{playlist_id}/tracks?fields=items(track(name%2Calbum(artists)))&limit=10")
    SpotifyPlaylistResponse findPlaylistByPlaylistId(@PathVariable("playlist_id") String playlistId);

}
