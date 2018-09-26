package com.shawntime.designpattern.factory.factorymethod.factory;

import com.shawntime.designpattern.factory.factorymethod.washingmachine.AbstractWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public interface AbstractFactory {

    AbstractWashingMachine createWashingMachine();
}
