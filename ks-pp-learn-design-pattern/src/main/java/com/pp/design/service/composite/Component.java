package com.pp.design.service.composite;

/**
 * @author gupp
 * @date 2022/6/5 18:07
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
