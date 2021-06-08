package io.emvnuel.github.ifoodbackendchallenge.client.openweathermap.response;

public class Coord {
    private long lon;
    private long lat;

    public long getLon() {
        return lon;
    }

    public void setLon(long value) {
        this.lon = value;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long value) {
        this.lat = value;
    }
}
