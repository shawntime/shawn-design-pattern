package com.shawntime.designpattern.factory.abstractfactory.washingmachine;

/**
 * ConcreteProduct（产品实现角色）：格力牌洗衣机
 */
public class GreeWashingMachine extends AbstractWashingMachine {

    @Override
    public void product() {
        System.out.println("格力牌洗衣机");
    }
}
