package com.moonspirit.design.structural.proxy.service;

import com.moonspirit.design.structural.proxy.dao.OrderDOMapper;
import com.moonspirit.design.structural.proxy.dao.OrderDOMapperImpl;
import com.moonspirit.design.structural.proxy.dataobject.OrderDO;

/**
 * 订单服务实现类
 */
public class OrderServiceImpl implements OrderService {
    private OrderDOMapper orderDOMapper;

    /**
     * 模拟Spring Autowired注入过程
     */
    public OrderServiceImpl() {
        this.orderDOMapper = new OrderDOMapperImpl();
    }

    @Override
    public int saveOrder(OrderDO orderDO) {
        System.out.println("Service层调用DAO层插入记录");
        return orderDOMapper.insert(orderDO);
    }
}
