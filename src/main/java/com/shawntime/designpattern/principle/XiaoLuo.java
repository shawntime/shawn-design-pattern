package com.shawntime.designpattern.principle;

public class XiaoLuo {

    public static void main(String[] args) {
        Person xiaoWang = new Person("小罗");
        TrafficTools trafficTools = new TrafficTools();
        trafficTools.buyTicket(xiaoWang, "私家车");
        trafficTools.go(xiaoWang, "私家车");


        ITrafficTools tools = new PrivateCar();
        tools.buyTicket(xiaoWang);
        tools.go(xiaoWang);

        TrafficTools trafficTools2 = new TrafficTools();
        trafficTools2.privteCarGo(xiaoWang);
    }
}
