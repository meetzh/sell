package com.imooc.constant;

/** redis常量
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/5 15:44
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //2小时
}
