package com.pp.design.service.bridge.abstraction;

/**
 * @author gupp
 * @date 2022/6/4 18:35
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
    }
}
