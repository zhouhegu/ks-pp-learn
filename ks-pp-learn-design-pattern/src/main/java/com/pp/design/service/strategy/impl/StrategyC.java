package com.pp.design.service.strategy.impl;

import com.pp.design.service.strategy.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/29 12:50
 */
@Service("strategyC")
public class StrategyC extends Strategy {
    @Override
    public void execute() {
        System.out.println("execute strategy C");
    }
}
