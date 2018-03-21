package cc.leevi.download1.provider.netease;

import cc.leevi.download1.utils.AESUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class AbstractNeteaseReq implements NeteaseReq{
    protected static final String MODULUS = "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7";

    protected static final String NONCE = "0CoJUm6Qyw8W8jud";

    protected static final String SEC_KEY = "3ab1a2a4ae3c93a3";

    protected static final String AES_IV = "0102030405060708";

    protected static final String ENC_SEC_KEY = "6e7a186719d51776d731786fb7942fee465a7725f44c3a283def31631e10b783da6caaf0fbf48e3ea8cdc012da5b566261e6ac8153c333b3334eaa01fe9dbf4aec41e2e8843c6c7a372033e7dc6fca2b8ac4c0584baf351dfe1e53bf4ed00ce34f10f517184de6118275ba1c85267576fc1719d940513466e7ef4ea45307cfca";

    public Map<String,Object> build() {
        String text = JSON.toJSONString(this);
        String encText = AESUtil.encrypt(SEC_KEY,AES_IV,AESUtil.encrypt(NONCE,AES_IV,text));
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("params",encText);
        params.put("encSecKey",ENC_SEC_KEY);
        return params;
    }
}
