package com.shawntime.designpattern.factory.simplefactory;

/**
 * ConcreteProduct（产品实现角色）：格力牌洗衣机
 */
public class GreeWashingMachine extends AbstractWashingMachine {

    @Override
    protected void product() {
        System.out.println("格力牌洗衣机");
    }
}
