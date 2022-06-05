package com.pp.design.service.composite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author gupp
 * @date 2022/6/5 18:14
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("leaf can't add component");
    }

    @Override
    public void remove(Component c) {
        System.out.println("leaf can't remove component");
    }

    @Override
    public void display(int depth) {
        char[] arr = new char[depth];
        Arrays.fill(arr, '-');
        System.out.println(new String(arr) + name);
    }
}
