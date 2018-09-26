package com.shawntime.designpattern.factory.abstractfactory;

import com.shawntime.designpattern.factory.abstractfactory.airconditioner.AbstractAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.tv.AbstractTV;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.AbstractWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public class TestMain {

    public static void main(String[] args) {
        AbstractFactory factory = new ChangHongFactory();
        AbstractAirConditioner airConditioner = factory.createAirConditioner();
        AbstractTV tv = factory.createTV();
        AbstractWashingMachine washingMachine = factory.createWashingMachine();
        airConditioner.product();
        tv.product();
        washingMachine.product();

        factory = new MediaFactory();
        airConditioner = factory.createAirConditioner();
        tv = factory.createTV();
        washingMachine = factory.createWashingMachine();
        airConditioner.product();
        tv.product();
        washingMachine.product();

        factory = new GreeFactory();
        airConditioner = factory.createAirConditioner();
        tv = factory.createTV();
        washingMachine = factory.createWashingMachine();
        airConditioner.product();
        tv.product();
        washingMachine.product();
    }
}
