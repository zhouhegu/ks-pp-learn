package com.pp.design.service.adapter;

/**
 * @author gupp
 * @date 2022/6/3 15:42
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        target.request();

        Target specialTarget = new Adapter();
        specialTarget.request();
    }
}
