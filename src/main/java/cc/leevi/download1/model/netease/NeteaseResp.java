package cc.leevi.download1.model.netease;

import java.util.List;

public class NeteaseResp {
    private List<SingleTrack> data;
    private int code;

    public List<SingleTrack> getData() {
        return data;
    }

    public void setData(List<SingleTrack> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
