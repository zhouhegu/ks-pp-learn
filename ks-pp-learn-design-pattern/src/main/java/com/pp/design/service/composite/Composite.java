package com.pp.design.service.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gupp
 * @date 2022/6/5 18:30
 */

public class Composite extends Component{

    /**
     * 存储其他组合或者叶子节点
     */
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        char[] arr = new char[depth];
        Arrays.fill(arr, '-');
        System.out.println(new String(arr) + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
