package com.pp.design.service.strategy;

import com.pp.design.service.strategy.impl.StrategyA;
import com.pp.design.service.strategy.impl.StrategyB;
import com.pp.design.service.strategy.impl.StrategyC;

/**
 * @author gupp
 * @date 2022/5/29 12:55
 */
public class Main {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();
        context.setStrategy(new StrategyA());
        context.doSomeThing();

        context.setStrategy(new StrategyB());
        context.doSomeThing();

        context.setStrategy(new StrategyC());
        context.doSomeThing();
    }
}
