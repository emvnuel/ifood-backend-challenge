package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response;

import java.util.List;

public class Item {
    private boolean collaborative;
    private String description;
    private ExternalUrls externalUrls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private Owner owner;
    private Object primaryColor;
    private Object itemPublic;
    private String snapshotID;
    private Tracks tracks;
    private String type;
    private String uri;

    public boolean getCollaborative() { return collaborative; }
    public void setCollaborative(boolean value) { this.collaborative = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public ExternalUrls getExternalUrls() { return externalUrls; }
    public void setExternalUrls(ExternalUrls value) { this.externalUrls = value; }

    public String getHref() { return href; }
    public void setHref(String value) { this.href = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public List<Image> getImages() { return images; }
    public void setImages(List<Image> value) { this.images = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner value) { this.owner = value; }

    public Object getPrimaryColor() { return primaryColor; }
    public void setPrimaryColor(Object value) { this.primaryColor = value; }

    public Object getItemPublic() { return itemPublic; }
    public void setItemPublic(Object value) { this.itemPublic = value; }

    public String getSnapshotID() { return snapshotID; }
    public void setSnapshotID(String value) { this.snapshotID = value; }

    public Tracks getTracks() { return tracks; }
    public void setTracks(Tracks value) { this.tracks = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getURI() { return uri; }
    public void setURI(String value) { this.uri = value; }
}
