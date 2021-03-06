package com.pp.design.service.chainOfResponsibility.impl;

import com.pp.design.enums.RequestTypeEnum;
import com.pp.design.param.Request;
import com.pp.design.service.chainOfResponsibility.Handler;
import com.pp.design.service.chainOfResponsibility.impl.CommonHandler;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/28 22:32
 */
@Service("secondHandler")
public class SecondHandler extends CommonHandler {

    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestTypeEnum.LEAVE_REQUEST
        || request.getRequestType() == RequestTypeEnum.RAISE_REQUEST) {
            System.out.println("Second handler can handle leave request or raise request!");
        } else {
            Handler nextHandler = getNextHandler();
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
    }
}
