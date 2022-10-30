package com.pp.basic.trywithresources;

import java.io.InputStream;

/**
 * @author gupp
 * @date 2022/10/30 17:27
 */
public class Main {
    public static void main(String[] args) {
        try {
            errorTest();
        } catch (Exception e) {
            Throwable[] suppressed = e.getSuppressed();
            e.printStackTrace();
            System.out.println(suppressed[0].toString());
        }
    }

    private static void errorTest() throws Exception{
        try (Resource resource = new Resource()) {
            resource.sayHello();
        }
    }
}
