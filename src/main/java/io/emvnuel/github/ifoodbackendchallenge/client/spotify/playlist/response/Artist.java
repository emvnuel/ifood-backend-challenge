package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlist.response;

public class Artist {
    private ExternalUrls externalUrls;
    private String href;
    private String id;
    private String name;
    private String uri;

    public ExternalUrls getExternalUrls() { return externalUrls; }
    public void setExternalUrls(ExternalUrls value) { this.externalUrls = value; }

    public String getHref() { return href; }
    public void setHref(String value) { this.href = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURI() { return uri; }
    public void setURI(String value) { this.uri = value; }
}
