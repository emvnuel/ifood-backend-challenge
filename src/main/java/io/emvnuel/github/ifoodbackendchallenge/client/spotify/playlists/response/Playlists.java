package io.emvnuel.github.ifoodbackendchallenge.client.spotify.playlists.response;

import java.util.List;

public class Playlists {
    private String href;
    private List<Item> items;
    private long limit;
    private String next;
    private long offset;
    private Object previous;
    private long total;

    public String getHref() { return href; }
    public void setHref(String value) { this.href = value; }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> value) { this.items = value; }

    public long getLimit() { return limit; }
    public void setLimit(long value) { this.limit = value; }

    public String getNext() { return next; }
    public void setNext(String value) { this.next = value; }

    public long getOffset() { return offset; }
    public void setOffset(long value) { this.offset = value; }

    public Object getPrevious() { return previous; }
    public void setPrevious(Object value) { this.previous = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }
}
