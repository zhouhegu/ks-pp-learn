package com.pp.design.service.templateMethod;

import com.pp.design.service.templateMethod.impl.ConcreteClassA;
import com.pp.design.service.templateMethod.impl.ConcreteClassB;

/**
 * @author gupp
 * @date 2022/5/29 21:39
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        AbstractClass classB = new ConcreteClassB();

        classA.templateMethod();

        classB.templateMethod();
    }
}
