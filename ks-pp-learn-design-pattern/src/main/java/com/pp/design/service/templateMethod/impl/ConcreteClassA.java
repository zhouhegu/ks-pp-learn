package com.pp.design.service.templateMethod.impl;

import com.pp.design.service.templateMethod.AbstractClass;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/29 21:35
 */
@Service("concreteClassA")
public class ConcreteClassA extends AbstractClass {
    @Override
    public void firstStep() {
        System.out.println("concrete class A first step");
    }

    @Override
    public void secondStep() {
        System.out.println("concrete class A second step");
    }
}
