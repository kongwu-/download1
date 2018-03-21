package cc.leevi.download1.provider;

import cc.leevi.download1.model.standard.StandardTrack;

import java.util.List;

public abstract class AbstractTrackProvider implements TrackProvider {

    protected static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.162 Safari/537.36";

    public String getTrackUrl(String id) {
        return null;
    }

    public List<StandardTrack> getTracks(String... id){
        return null;
    }

    public List<StandardTrack> getPlayList(String id){
        return null;
    }

}
