package com.pp.design.service.composite;

/**
 * @author gupp
 * @date 2022/6/5 18:35
 */
public class Main {
    public static void main(String[] args) {
        Component root = new Composite("Root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component compX = new Composite("Composite X");
        compX.add(new Leaf("Leaf XA"));
        compX.add(new Leaf("Leaf XB"));

        root.add(compX);

        Component compXY = new Composite("Composite XY");
        compXY.add(new Leaf("Leaf XYA"));
        compXY.add(new Leaf("Leaf XYB"));
        compX.add(compXY);

        root.add(new Leaf("Leaf C"));
        root.add(new Leaf("Leaf D"));

        root.display(1);
    }
}
