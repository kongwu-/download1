package cc.leevi.download1.provider.netease;

import cc.leevi.download1.utils.AESUtil;
import com.alibaba.fastjson.JSON;

public class PlayListReq extends AbstractNeteaseReq{
    private String id;
    private int offset = 0;
    private boolean total = true;
    private int limit = 1000;
    private int n = 1000;
    private String csrf_token = "";

    public PlayListReq() {
    }

    public PlayListReq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isTotal() {
        return total;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getOffset() {
        return offset;
    }

    public void setTotal(boolean total) {
        this.total = total;
    }
    public boolean getTotal() {
        return total;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getLimit() {
        return limit;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

    public void setCsrf_token(String csrf_token) {
        this.csrf_token = csrf_token;
    }
    public String getCsrf_token() {
        return csrf_token;
    }


}
