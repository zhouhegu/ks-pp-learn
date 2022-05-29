package com.pp.design.service.strategy.impl;

import com.pp.design.service.strategy.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/29 12:47
 */
@Service("strategyA")
public class StrategyA extends Strategy {
    @Override
    public void execute() {
        System.out.println("execute strategy A");
    }
}
