package com.shawntime.designpattern.principle;

public class XiaoLi {

    public static void main(String[] args) {
        Person xiaoWang = new Person("小王");
        TrafficTools trafficTools = new TrafficTools();
        trafficTools.buyTicket(xiaoWang, "高铁");
        trafficTools.go(xiaoWang, "高铁");

        ITrafficTools tools = new HighSpeedTrain();
        tools.buyTicket(xiaoWang);
        tools.go(xiaoWang);

        TrafficTools trafficTools2 = new TrafficTools();
        trafficTools2.buyHighSpeedTicket(xiaoWang);
        trafficTools2.highSpeedGo(xiaoWang);
    }
}
