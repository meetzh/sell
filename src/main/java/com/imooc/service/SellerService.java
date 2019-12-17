package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/** 卖家端
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/5 10:30
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findByOpenid(String openid);
}
