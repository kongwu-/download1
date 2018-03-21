package cc.leevi.download1.provider;

import cc.leevi.download1.model.standard.StandardTrack;

import java.util.List;

public interface TrackProvider extends Provider {
    public String getTrackUrl(String id);
    public List<StandardTrack> getTracks(String... id);
    public List<StandardTrack> getPlayList(String id);

}
