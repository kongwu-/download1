package cc.leevi.download1.provider.netease;

import java.util.ArrayList;
import java.util.List;

public class TrackReq extends AbstractNeteaseReq{
    private List<String> ids;
    private long br = 320000;
    private String csrf_token;

    public TrackReq(List<String> ids) {
        this.ids = ids;
    }

    public TrackReq(final String id) {
        this.ids = new ArrayList<String>(){{
            add(id);
        }};
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public long getBr() {
        return br;
    }

    public void setBr(long br) {
        this.br = br;
    }

    public String getCsrf_token() {
        return csrf_token;
    }

    public void setCsrf_token(String csrf_token) {
        this.csrf_token = csrf_token;
    }
}
