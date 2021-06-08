package io.emvnuel.github.ifoodbackendchallenge.controller;

import io.emvnuel.github.ifoodbackendchallenge.client.openweathermap.OpenWeatherMapClient;
import io.emvnuel.github.ifoodbackendchallenge.client.openweathermap.response.OpenWeatherMapResponse;
import io.emvnuel.github.ifoodbackendchallenge.client.spotify.SpotifyClient;
import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response.SpotifyPlaylistResponse;
import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response.Item;
import io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response.SpotifyPlaylistsResponse;
import io.emvnuel.github.ifoodbackendchallenge.model.Playlist;
import io.emvnuel.github.ifoodbackendchallenge.shared.StringFormatter;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.emvnuel.github.ifoodbackendchallenge.service.GenreSuggestionService;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlist-suggestion")
@Validated
public class PlaylistSuggestionController {

    private final OpenWeatherMapClient openWeatherMapClient;
    private final SpotifyClient spotifyClient;
    private final Set<GenreSuggestionService> genreSuggestionRules;

    public PlaylistSuggestionController(OpenWeatherMapClient openWeatherMapClient,
                                        SpotifyClient spotifyClient,
                                        Set<GenreSuggestionService> genreSuggestionRules) {
        this.openWeatherMapClient = openWeatherMapClient;
        this.spotifyClient = spotifyClient;
        this.genreSuggestionRules = genreSuggestionRules;
    }


    @GetMapping(value = "by-name", params = {"name"})
    public ResponseEntity<Playlist> playlistSuggestionByCityName(
            @RequestParam("name") @NotEmpty String placeName) {
        OpenWeatherMapResponse response = openWeatherMapClient.findByCityName(placeName);
        Playlist playlist =  playlistSuggestionByTemperature(response.getMain().getTemp());
        return ResponseEntity.ok().body(playlist);
    }

    @GetMapping(value = "by-lat-and-lon", params = {"lat", "lon"})
    public ResponseEntity<Playlist> playlistSuggestionByPlaceLatitudeAndLongitude(
            @RequestParam @Min(value = -90) @Max(90) Double lat,
            @Min(-180) @Max(180) @RequestParam Double lon) {
        OpenWeatherMapResponse response = openWeatherMapClient.findByLatAndLon(lat, lon);
        Playlist playlist =  playlistSuggestionByTemperature(response.getMain().getTemp());
        return ResponseEntity.ok().body(playlist);
    }

    private Playlist playlistSuggestionByTemperature(Double temperature) {
        String musicGenre = musicGenreByTemperature(temperature);
        Item firstPlaylist = spotifyClient
                .findPlaylistsByMusicGenre(musicGenre)
                .getPlaylists()
                .getItems().get(0);

        SpotifyPlaylistResponse spotifyResponse =  spotifyClient.findPlaylistByPlaylistId(firstPlaylist.getID());
        Playlist playlist = new Playlist(firstPlaylist.getName(),
                musicGenre,
                spotifyResponse.getItems().stream()
                        .map(p -> StringFormatter.format(p.getTrack().getAlbum().getArtists().stream().map(a -> a.getName()).collect(Collectors.toList())) + " - "+ p.getTrack().getName())
                        .collect(Collectors.toList())
        );

        return playlist;
    }

    private String musicGenreByTemperature(Double temperature) {
        return genreSuggestionRules.stream()
            .filter(genreSuggestionRule -> genreSuggestionRule.isTemperatureSuitableToMusicGenre(temperature))
            .findFirst()
            .orElseThrow(() -> new RuntimeException())
            .getMusicGenre();
    }

}
