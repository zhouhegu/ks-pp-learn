package com.pp.design.service.chainOfResponsibility.impl;

import com.pp.design.param.Request;
import com.pp.design.service.chainOfResponsibility.Handler;

/**
 * @author gupp
 * @date 2022/5/28 22:23
 */
public abstract class CommonHandler implements Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("This is common Handler");
    }
}
