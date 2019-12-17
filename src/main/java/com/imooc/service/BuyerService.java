package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**买家
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/29 16:48
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
