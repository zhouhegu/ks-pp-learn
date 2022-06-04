package com.pp.basic.ab;

/**
 * @author gupp
 * @date 2022/6/3 22:03
 * 接口嵌套在类中
 */
public class ClassA {

    interface B {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {

        }
    }

    public class BImp2 implements B {
        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        @Override
        public void f() {

        }
    }

    private class CImp2 implements C {
        @Override
        public void f() {

        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        @Override
        public void f() {

        }
    }

    public class DImpl2 implements D {
        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}
