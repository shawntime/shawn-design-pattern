package com.shawntime.designpattern.factory.simplefactory;

/**
 * ConcreteProduct（产品实现角色）：长虹牌洗衣机
 */
public class ChangHongWashingMachine extends AbstractWashingMachine {

    @Override
    protected void product() {
        System.out.println("长虹牌洗衣机");
    }
}
