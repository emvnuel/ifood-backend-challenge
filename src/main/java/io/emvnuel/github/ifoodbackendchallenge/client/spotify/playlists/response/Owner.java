package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response;

public class Owner {
    private String displayName;
    private ExternalUrls externalUrls;
    private String href;
    private String id;
    private String type;
    private String uri;

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String value) { this.displayName = value; }

    public ExternalUrls getExternalUrls() { return externalUrls; }
    public void setExternalUrls(ExternalUrls value) { this.externalUrls = value; }

    public String getHref() { return href; }
    public void setHref(String value) { this.href = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getURI() { return uri; }
    public void setURI(String value) { this.uri = value; }
}
