package com.pp.basic.ab;

/**
 * @author gupp
 * @date 2022/6/3 20:30
 */
public interface BasicInterface {
    int num = 2;

    void f2();

    default void f3() {
        System.out.println(222);
    }

    static void f4() {
        System.out.println(333);
    }
}
