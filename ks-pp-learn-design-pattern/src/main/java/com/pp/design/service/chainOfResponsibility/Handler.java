package com.pp.design.service.chainOfResponsibility;

import com.pp.design.param.Request;

/**
 * @author gupp
 * @date 2022/5/29 10:36
 */
public interface Handler {
    void handle(Request request);
}
