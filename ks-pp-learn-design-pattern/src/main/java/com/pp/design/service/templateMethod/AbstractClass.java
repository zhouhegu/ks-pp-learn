package com.pp.design.service.templateMethod;

/**
 * @author gupp
 * @date 2022/5/29 21:32
 */
public abstract class AbstractClass {

    public abstract void firstStep();

    public abstract void secondStep();

    public void thirdStep() {
        System.out.println("third step has default operation");
    }

    public final void templateMethod() {
        firstStep();
        secondStep();
        thirdStep();
    }
}
