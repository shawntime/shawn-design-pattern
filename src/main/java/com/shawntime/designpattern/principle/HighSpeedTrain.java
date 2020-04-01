package com.shawntime.designpattern.principle;

public class HighSpeedTrain implements ITrafficTools {

    @Override
    public void buyTicket(Person person) {
        System.out.println(person.getName() + "买票");
    }

    @Override
    public void go(Person person) {
        System.out.println(person.getName() + "乘坐高铁回家...");
    }
}
