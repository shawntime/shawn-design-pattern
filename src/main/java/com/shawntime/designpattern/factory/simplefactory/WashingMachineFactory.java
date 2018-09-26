package com.shawntime.designpattern.factory.simplefactory;

/**
 * Created by shma on 2018/4/13.
 */
public class WashingMachineFactory {

    public static AbstractWashingMachine create(FactoryTypeEnum typeEnum) {
        switch (typeEnum) {
            case CHANGHONG:
                return new ChangHongWashingMachine();
            case GREE:
                return new GreeWashingMachine();
            case MEDIA:
                return new MediaWashingMachine();
            default:
                return null;
        }
    }
}
