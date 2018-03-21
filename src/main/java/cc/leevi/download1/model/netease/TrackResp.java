/**
  * Copyright 2018 bejson.com 
  */
package cc.leevi.download1.model.netease;
import java.util.List;

/**
 * Auto-generated: 2018-03-21 9:55:9
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class TrackResp {

    private Playlist playlist;
    private int code;
    private List<Privilege> privileges;
    public void setPlaylist(Playlist playlist) {
         this.playlist = playlist;
     }
     public Playlist getPlaylist() {
         return playlist;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setPrivileges(List<Privilege> privileges) {
         this.privileges = privileges;
     }
     public List<Privilege> getPrivileges() {
         return privileges;
     }

}