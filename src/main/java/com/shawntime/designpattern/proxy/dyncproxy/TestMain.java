package com.shawntime.designpattern.proxy.dyncproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mashaohua
 * @title: TODO 要求能简洁的表达出类的功能
 * @description: TODO 简要描述类的职责、实现方式、作用功能
 * @date 2020/12/23 9:51
 * @menu
 */
public class TestMain {

    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        System.out.println(Cat.class.getInterfaces());
        IEat proxyCat = (IEat) Proxy.newProxyInstance(cat.getClass().getClassLoader(), Cat.class.getInterfaces(), (proxy, method, args1) -> {
            System.out.println("先洗手..");
            Object object = method.invoke(cat, args1);
            System.out.println("擦嘴..");
            return object;
        });
        proxyCat.eat();
    }
}
