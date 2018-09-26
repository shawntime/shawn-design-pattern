package com.shawntime.designpattern.factory.simplefactory;

/**
 * 输出：
 *  长虹牌洗衣机
    格力牌洗衣机
    美的牌洗衣机
 */
public class TestMain {

    public static void main(String[] args) {
        AbstractWashingMachine washingMachine = WashingMachineFactory.create(FactoryTypeEnum.CHANGHONG);
        washingMachine.product();
        washingMachine = WashingMachineFactory.create(FactoryTypeEnum.GREE);
        washingMachine.product();
        washingMachine = WashingMachineFactory.create(FactoryTypeEnum.MEDIA);
        washingMachine.product();
    }
}
