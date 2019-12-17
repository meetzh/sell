package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/2 20:57
 */
public class JsonUtil {

    public static String toJSON(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
