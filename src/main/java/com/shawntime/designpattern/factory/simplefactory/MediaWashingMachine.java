package com.shawntime.designpattern.factory.simplefactory;

/**
 * ConcreteProduct（产品实现角色）：美的牌洗衣机
 */
public class MediaWashingMachine extends AbstractWashingMachine {

    @Override
    protected void product() {
        System.out.println("美的牌洗衣机");
    }
}
