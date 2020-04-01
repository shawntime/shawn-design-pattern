package com.shawntime.designpattern.principle;

/**
 * 私家车
 */
public class PrivateCar implements ITrafficTools {

    @Override
    public void buyTicket(Person person) {
        // 私家车不需要买票
    }

    @Override
    public void go(Person person) {
        System.out.println(person.getName() + "乘私家车回家...");
    }
}
