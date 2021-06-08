package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response;

public class Tracks {
    private String href;
    private long total;

    public String getHref() { return href; }
    public void setHref(String value) { this.href = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }
}
