package com.pp.design.service.adapter;

import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/6/3 15:39
 * 适配器类
 */
@Service("adapter")
public class Adapter extends Target{

    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
