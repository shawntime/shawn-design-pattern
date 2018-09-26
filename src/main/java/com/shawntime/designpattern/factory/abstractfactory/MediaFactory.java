package com.shawntime.designpattern.factory.abstractfactory;

import com.shawntime.designpattern.factory.abstractfactory.airconditioner.AbstractAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.airconditioner.ChangHongAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.airconditioner.MediaAirConditioner;
import com.shawntime.designpattern.factory.abstractfactory.tv.AbstractTV;
import com.shawntime.designpattern.factory.abstractfactory.tv.ChangHongTV;
import com.shawntime.designpattern.factory.abstractfactory.tv.MediaTV;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.AbstractWashingMachine;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.ChangHongWashingMachine;
import com.shawntime.designpattern.factory.abstractfactory.washingmachine.MediaWashingMachine;

/**
 * Created by shma on 2018/4/18.
 */
public class MediaFactory implements AbstractFactory {
    public AbstractWashingMachine createWashingMachine() {
        return new MediaWashingMachine();
    }

    public AbstractTV createTV() {
        return new MediaTV();
    }

    public AbstractAirConditioner createAirConditioner() {
        return new MediaAirConditioner();
    }
}
