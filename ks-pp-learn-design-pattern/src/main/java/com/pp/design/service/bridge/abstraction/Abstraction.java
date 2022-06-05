package com.pp.design.service.bridge.abstraction;

import com.pp.design.service.bridge.implementation.Implementor;

/**
 * @author gupp
 * @date 2022/6/4 18:32
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
