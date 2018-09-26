package com.shawntime.designpattern.factory.abstractfactory;


import com.shawntime.designpattern.factory.abstractfactory.airconditioner.AbstractAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.tv.AbstractTV;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.AbstractWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public interface AbstractFactory {

    AbstractWashingMachine createWashingMachine();

    AbstractTV createTV();

    AbstractAirConditioner createAirConditioner();
}
