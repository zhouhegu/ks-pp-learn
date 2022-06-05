package com.pp.design.service.bridge.implementation.impl;

import com.pp.design.service.bridge.implementation.Implementor;

/**
 * @author gupp
 * @date 2022/6/4 18:30
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operation() {
        System.out.println("This is ConcreteImplementorB operation");
    }

}
