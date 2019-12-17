package com.imooc.utils;

import java.util.Random;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/28 20:27
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
