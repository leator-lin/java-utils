package com.lea.myFastJsonUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lea.myGsonUtil.bean.User;

public class FastJsonUtil {
    private static final SerializeConfig CONFIG;

    static {
        CONFIG = new SerializeConfig();
        CONFIG.put(java.util.Date.class, new JSONLibDataFormatSerializer());
        CONFIG.put(java.sql.Date.class, new JSONLibDataFormatSerializer());
    }

    private static final SerializerFeature[] FEATURES = {
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.WriteNullBooleanAsFalse,
            SerializerFeature.WriteNullStringAsEmpty
    };

    public static String convertObjectToJSON(Object object) {
        return JSON.toJSONString(object, CONFIG, FEATURES);
    }

    public static void main(String[] args) {
        User user = new User("林银城", 12, "c1053595207@163.com");
        System.out.println(convertObjectToJSON(user));
    }
}
