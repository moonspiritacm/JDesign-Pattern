package com.moonspirit.design.structural.proxy.service;

import com.moonspirit.design.structural.proxy.dataobject.OrderDO;

/**
 * 订单服务接口
 */
public interface OrderService {
    int saveOrder(OrderDO orderDO);
}
