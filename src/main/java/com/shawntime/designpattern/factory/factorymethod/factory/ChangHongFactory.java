package com.shawntime.designpattern.factory.factorymethod.factory;

import com.shawntime.designpattern.factory.factorymethod.washingmachine.AbstractWashingMachine;
import com.shawntime.designpattern.factory.factorymethod.washingmachine.ChangHongWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public class ChangHongFactory implements AbstractFactory {

    public AbstractWashingMachine createWashingMachine() {
        return new ChangHongWashingMachine();
    }
}
