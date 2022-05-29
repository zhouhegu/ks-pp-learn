package com.pp.design.service.templateMethod.impl;

import com.pp.design.service.templateMethod.AbstractClass;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/29 21:36
 */
@Service("concreteClassB")
public class ConcreteClassB extends AbstractClass {
    @Override
    public void firstStep() {
        System.out.println("concrete class B first step");
    }

    @Override
    public void secondStep() {
        System.out.println("concrete class B second step");
    }

    @Override
    public void thirdStep() {
        System.out.println("concrete class B third step");
    }
}
