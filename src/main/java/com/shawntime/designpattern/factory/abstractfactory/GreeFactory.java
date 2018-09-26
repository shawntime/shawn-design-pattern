package com.shawntime.designpattern.factory.abstractfactory;

import com.shawntime.designpattern.factory.abstractfactory.airconditioner.AbstractAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.airconditioner.GreeAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.airconditioner.MediaAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.tv.AbstractTV;
import com.shawntime.designpattern.factory.abstractfactory.tv.GreeTV;
import com.shawntime.designpattern.factory.abstractfactory.tv.MediaTV;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.AbstractWashingMachine;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.GreeWashingMachine;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.MediaWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public class GreeFactory implements AbstractFactory {
    public AbstractWashingMachine createWashingMachine() {
        return new GreeWashingMachine();
    }

    public AbstractTV createTV() {
        return new GreeTV();
    }

    public AbstractAirConditioner createAirConditioner() {
        return new GreeAirConditioner();
    }
}
