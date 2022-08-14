package com.pp.basic.typeinfo.reflect;

/**
 * @author gupp
 * @date 2022/7/31 20:30
 */

public class SimpleProxyDemo {

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimProxy(new RealObject()));
    }

    public static void consumer(Interface face) {
        face.doSomething();
        face.somethingElse("bonobo");
    }
}

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimProxy implements Interface {

    private final Interface proxied;

    SimProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
