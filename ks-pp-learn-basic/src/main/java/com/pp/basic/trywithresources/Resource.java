package com.pp.basic.trywithresources;

/**
 * @author gupp
 * @date 2022/10/30 17:24
 */
public class Resource implements AutoCloseable{

    public void sayHello() throws Exception {
        throw new Exception("Resource throw Exception");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Resource close throw Exception");
    }
}
