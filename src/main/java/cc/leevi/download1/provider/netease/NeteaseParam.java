package cc.leevi.download1.provider.netease;

public class NeteaseParam {
    private String params;
    private String encSecKey;

    public NeteaseParam(String params, String encSecKey) {
        this.params = params;
        this.encSecKey = encSecKey;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getEncSecKey() {
        return encSecKey;
    }

    public void setEncSecKey(String encSecKey) {
        this.encSecKey = encSecKey;
    }
}
