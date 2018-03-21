package cc.leevi.download1;

import cc.leevi.download1.model.standard.StandardTrack;
import cc.leevi.download1.provider.TrackProvider;
import cc.leevi.download1.provider.netease.NeteaseTrackProvider;

import java.util.List;

public class NeteaseTest {
    public static void main(String[] args) {
        TrackProvider trackProvider = new NeteaseTrackProvider();
        List<StandardTrack> playList = trackProvider.getPlayList("8648649");
        for(StandardTrack track : playList){
            System.out.println(String.format("%s - %s - 《%s》 duration: %d",track.getName(),track.getArtist().getName(),track.getAlbum().getName(),track.getDuration()));
            System.out.println(trackProvider.getTrackUrl(track.getId()));

        }
        System.out.println(playList);
//        System.out.println(trackProvider.getTrackUrl("242057"));
    }
}
