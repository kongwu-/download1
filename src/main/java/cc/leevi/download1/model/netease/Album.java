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
public class Album {

    private long id;
    private String name;
    private String picUrl;
    private List<String> tns;
    private long pic;
    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPicUrl(String picUrl) {
         this.picUrl = picUrl;
     }
     public String getPicUrl() {
         return picUrl;
     }

    public void setTns(List<String> tns) {
         this.tns = tns;
     }
     public List<String> getTns() {
         return tns;
     }

    public void setPic(long pic) {
         this.pic = pic;
     }
     public long getPic() {
         return pic;
     }

}