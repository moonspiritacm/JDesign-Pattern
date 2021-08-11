package com.moonspirit.design.structural.proxy.dao;

import com.moonspirit.design.structural.proxy.dataobject.OrderDO;

/**
 * 订单实体的数据库操作接口
 */
public interface OrderDOMapper {
    int insert(OrderDO record);
}
