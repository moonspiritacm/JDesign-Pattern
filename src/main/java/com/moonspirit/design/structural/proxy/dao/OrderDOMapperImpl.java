package com.moonspirit.design.structural.proxy.dao;

import com.moonspirit.design.structural.proxy.dataobject.OrderDO;

/**
 * 订单实体的数据库操作实现类
 */
public class OrderDOMapperImpl implements OrderDOMapper {
    @Override
    public int insert(OrderDO record) {
        System.out.println("数据库插入Order成功");
        return 1;
    }
}
