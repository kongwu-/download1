package cc.leevi.download1.model;

public enum  Source {
    NETEASE("网易云音乐"),XIAMI("虾米音乐"),QQ("QQ音乐");
    private String alias;

    Source(String alias) {
        this.alias = alias;
    }

    Source() {

    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
