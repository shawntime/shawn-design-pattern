package com.shawntime.designpattern.factory.abstractfactory;

import com.shawntime.designpattern.factory.abstractfactory.airconditioner.AbstractAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.airconditioner.ChangHongAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.tv.AbstractTV;
import com.shawntime.designpattern.factory.abstractfactory.tv.ChangHongTV;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.AbstractWashingMachine;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.ChangHongWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public class ChangHongFactory implements AbstractFactory {
    public AbstractWashingMachine createWashingMachine() {
        return new ChangHongWashingMachine();
    }

    public AbstractTV createTV() {
        return new ChangHongTV();
    }

    public AbstractAirConditioner createAirConditioner() {
        return new ChangHongAirConditioner();
    }
}
