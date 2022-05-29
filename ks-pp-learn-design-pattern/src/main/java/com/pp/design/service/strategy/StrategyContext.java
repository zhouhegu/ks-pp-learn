package com.pp.design.service.strategy;

/**
 * @author gupp
 * @date 2022/5/29 12:52
 */
public class StrategyContext {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomeThing() {
        strategy.execute();
    }
}
