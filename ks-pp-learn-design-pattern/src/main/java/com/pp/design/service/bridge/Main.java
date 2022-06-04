package com.pp.design.service.bridge;

import com.pp.design.service.bridge.abstraction.Abstraction;
import com.pp.design.service.bridge.abstraction.RefinedAbstraction;
import com.pp.design.service.bridge.implementation.impl.ConcreteImplementorA;
import com.pp.design.service.bridge.implementation.impl.ConcreteImplementorB;

/**
 * @author gupp
 * @date 2022/6/4 18:36
 */
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
