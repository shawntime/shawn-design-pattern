package com.shawntime.designpattern.principle;

/**
 * 交通工具类
 */
public class TrafficTools {

    public void buyTicket(Person person, String trafficToolType) {
        if ("高铁".equals(trafficToolType)) {
            System.out.println(person.getName() + "买票");
        }
        if ("私家车".equals(trafficToolType)) {
            // 私家车不需要买票，不做处理
        }
    }

    public void go(Person person, String trafficToolType) {
        if ("高铁".equals(trafficToolType)) {
            System.out.println(person.getName() + "乘坐高铁回家");
        }
        if ("私家车".equals(trafficToolType)) {
            System.out.println(person.getName() + "乘坐私家车回家");
        }
    }

    public void buyHighSpeedTicket(Person person) {
        System.out.println(person.getName() + "买票");
    }

    public void highSpeedGo(Person person) {
        System.out.println(person.getName() + "乘坐高铁回家");
    }

    public void privteCarGo(Person person) {
        System.out.println(person.getName() + "乘坐私家车回家");
    }
}
