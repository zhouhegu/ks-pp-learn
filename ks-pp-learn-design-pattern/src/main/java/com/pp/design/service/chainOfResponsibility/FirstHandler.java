package com.pp.design.service.chainOfResponsibility;

import com.pp.design.enums.RequestTypeEnum;
import com.pp.design.param.Request;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/28 22:26
 */
@Service("firstHandler")
public class FirstHandler extends CommonHandler{

    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestTypeEnum.LEAVE_REQUEST) {
            System.out.println("First handler can handle leave request!");
        } else {
            Handler nextHandler = getNextHandler();
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
    }
}
