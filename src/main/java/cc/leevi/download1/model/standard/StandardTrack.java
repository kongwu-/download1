package cc.leevi.download1.model.standard;

import cc.leevi.download1.model.Source;

public class StandardTrack {
    private String id;
    private String name;
    private int duration;
    private StandardArtist artist;
    private StandardAlbum album;
    private Source source;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StandardArtist getArtist() {
        return artist;
    }

    public void setArtist(StandardArtist artist) {
        this.artist = artist;
    }

    public StandardAlbum getAlbum() {
        return album;
    }

    public void setAlbum(StandardAlbum album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "StandardTrack{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", artist=" + artist +
                ", album=" + album +
                ", source=" + source +
                ", url='" + url + '\'' +
                '}';
    }
}
