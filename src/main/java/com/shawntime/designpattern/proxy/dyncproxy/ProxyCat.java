package com.shawntime.designpattern.proxy.dyncproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author mashaohua
 * @title: TODO 要求能简洁的表达出类的功能
 * @description: TODO 简要描述类的职责、实现方式、作用功能
 * @date 2020/12/23 9:51
 * @menu
 */
public class ProxyCat implements InvocationHandler {

    private Object object;

    public ProxyCat(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先洗手..");
        Object object = method.invoke(proxy, args);
        System.out.println("擦嘴..");
        return object;
    }
}
