package com.shawntime.designpattern.proxy.dyncproxy;

/**
 * @author mashaohua
 * @title: TODO 要求能简洁的表达出类的功能
 * @description: TODO 简要描述类的职责、实现方式、作用功能
 * @date 2020/12/23 9:49
 * @menu
 */
public class Cat implements IEat, IPlay {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "eat...");
    }

    @Override
    public void play() {
        System.out.println(name + "play...");
    }

    public String getName() {
        return name;
    }
}
