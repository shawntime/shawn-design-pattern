package com.shawntime.designpattern.factory.abstractfactory.airconditioner;

/**
 * Created by shma on 2018/4/18.
 */
public class ChangHongAirConditioner extends AbstractAirConditioner {
    @Override
    public void product() {
        System.out.println("长虹空调");
    }
}
