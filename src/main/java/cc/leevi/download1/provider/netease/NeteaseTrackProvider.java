package cc.leevi.download1.provider.netease;

import cc.leevi.download1.model.Source;
import cc.leevi.download1.model.netease.*;
import cc.leevi.download1.model.standard.StandardAlbum;
import cc.leevi.download1.model.standard.StandardArtist;
import cc.leevi.download1.model.standard.StandardTrack;
import cc.leevi.download1.provider.AbstractTrackProvider;
import com.alibaba.fastjson.JSON;
import com.github.kevinsawicki.http.HttpRequest;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NeteaseTrackProvider extends AbstractTrackProvider {

    protected static final String TRACK_TARGET_URL = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";
    protected static final String PLAYLIST_TARGET_URL = "http://music.163.com/weapi/v3/playlist/detail";

    public String sendRequest(String url,Map<String,Object> params){
        HttpRequest request = HttpRequest.post(url);
        return request.userAgent(USER_AGENT).form(params).body();
    }

    @Override
    public String getTrackUrl(String id) {
        TrackReq trackReq = new TrackReq(id);
        Map<String,Object> params = trackReq.build();
        String body = sendRequest(TRACK_TARGET_URL,params);
        List<String> urls = parseSingleTrack(body);
        return CollectionUtils.isNotEmpty(urls)?urls.get(0):null;
    }

    @Override
    public List<StandardTrack> getTracks(String... id) {
        return super.getTracks(id);
    }

    @Override
    public List<StandardTrack> getPlayList(String id) {
        PlayListReq playListReq = new PlayListReq(id);
        Map<String,Object> params = playListReq.build();
        String body = sendRequest(PLAYLIST_TARGET_URL,params);
        List<StandardTrack> platList = parsePlayList(body);
        return platList;
    }

    private List<String> parseSingleTrack(String body){
        NeteaseResp resp = JSON.parseObject(body,NeteaseResp.class);
        List<String> urls = new ArrayList<String>();
        for(SingleTrack singleTrack : resp.getData()){
            urls.add(singleTrack.getUrl());
        }
        return urls;
    }

    private List<StandardTrack> parsePlayList(String body){
        TrackResp trackResp = JSON.parseObject(body,TrackResp.class);
        List<Track> tracks = trackResp.getPlaylist().getTracks();
        List<StandardTrack> standardTracks = new ArrayList<StandardTrack>();
        for(Track track : tracks){
            StandardTrack standardTrack = new StandardTrack();
            standardTrack.setDuration(track.getDt());
            standardTrack.setId(String.valueOf(track.getId()));
            standardTrack.setName(track.getName());
            Album album = track.getAl();
            StandardAlbum standardAlbum = new StandardAlbum();
            standardAlbum.setId(String.valueOf(album.getId()));
            standardAlbum.setName(album.getName());
            standardAlbum.setImage(album.getPicUrl());
            standardTrack.setAlbum(standardAlbum);
            standardTrack.setSource(Source.NETEASE);
            Artist artist = track.getAr().get(0);
            StandardArtist standardArtist = new StandardArtist();
            standardArtist.setId(String.valueOf(artist.getId()));
            standardArtist.setName(artist.getName());
            standardTrack.setArtist(standardArtist);
            standardTracks.add(standardTrack);
        }
        return standardTracks;
    }
}
