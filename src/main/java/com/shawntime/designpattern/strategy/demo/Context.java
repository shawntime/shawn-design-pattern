package com.shawntime.designpattern.strategy.demo;

/**
 * 环境角色类
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 对外暴露的策略方法
    public void contextInterface() {
        strategy.strategyInterface();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
