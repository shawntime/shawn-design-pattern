package com.shawntime.designpattern.factory.factorymethod.washingmachine;

/**
 * ConcreteProduct（产品实现角色）：长虹牌洗衣机
 */
public class ChangHongWashingMachine extends AbstractWashingMachine {

    @Override
    public void product() {
        System.out.println("长虹牌洗衣机");
    }
}
