package com.moonspirit.design.structural.proxy.staticproxy;

import com.moonspirit.design.structural.proxy.dataobject.OrderDO;
import com.moonspirit.design.structural.proxy.service.OrderService;
import com.moonspirit.design.structural.proxy.service.OrderServiceImpl;

/**
 * 订单服务的静态代理类
 */
public class OrderServiceStaticProxy {
    //注入目标对象
    private OrderService orderService;

    /**
     * 模拟Spring Autowired注入过程
     */
    public OrderServiceStaticProxy() {
        this.orderService = new OrderServiceImpl();
    }

    public int saveOrder(OrderDO orderDO) {
        beforeMethod();
        int userId = orderDO.getUserId();
        int dbId = userId % 2;
        System.out.println("静态代理：分配到【db" + dbId + "】");
        afterMethod();
        return orderService.saveOrder(orderDO);
    }

    private void beforeMethod() {
        System.out.println("静态代理：before");
    }

    private void afterMethod() {
        System.out.println("静态代理：after");
    }
}
