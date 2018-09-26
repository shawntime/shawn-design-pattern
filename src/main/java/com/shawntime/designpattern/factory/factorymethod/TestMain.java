package com.shawntime.designpattern.factory.factorymethod;

import com.shawntime.designpattern.factory.factorymethod.factory.AbstractFactory;
import com.shawntime.designpattern.factory.factorymethod.factory.ChangHongFactory;
import com.shawntime.designpattern.factory.factorymethod.factory.GreeFactory;
import com.shawntime.designpattern.factory.factorymethod.factory.MediaFactory;
import com.shawntime.designpattern.factory.factorymethod.washingmachine.AbstractWashingMachine;

/**
 * 输出：
 *   长虹牌洗衣机
     美的牌洗衣机
     格力牌洗衣机
 */
public class TestMain {

    public static void main(String[] args) {
        AbstractFactory factory = new ChangHongFactory();
        AbstractWashingMachine washingMachine = factory.createWashingMachine();
        washingMachine.product();

        factory = new MediaFactory();
        washingMachine = factory.createWashingMachine();
        washingMachine.product();

        factory = new GreeFactory();
        washingMachine = factory.createWashingMachine();
        washingMachine.product();
    }
}
