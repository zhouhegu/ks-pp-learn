package com.pp.design.service.chainOfResponsibility;

import com.pp.design.param.Request;

/**
 * @author gupp
 * @date 2022/5/28 22:23
 */
public abstract class CommonHandler{

    private CommonHandler nextHandler;

    public void setNextHandler(CommonHandler handler) {
        this.nextHandler = handler;
    }

    public CommonHandler getNextHandler() {
        return nextHandler;
    }

    public void handle(Request request) {
        System.out.println("This is common Handler");
    }
}
