package com.pp.design.service.chainOfResponsibility;

import com.pp.design.enums.RequestTypeEnum;
import com.pp.design.param.Request;

/**
 * @author gupp
 * @date 2022/5/28 22:35
 */
public class Main {
    public static void main(String[] args) {
        CommonHandler firstHandler = new FirstHandler();
        CommonHandler secondHandler = new SecondHandler();
        CommonHandler thirdHandler = new ThirdHandler();
        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        Request leaveRequest = new Request(RequestTypeEnum.LEAVE_REQUEST);
        Request raiseRequest = new Request(RequestTypeEnum.RAISE_REQUEST);
        Request resignRequest = new Request(RequestTypeEnum.RESIGN_REQUEST);

        System.out.println("==========leave Request==========");
        firstHandler.handle(leaveRequest);
        secondHandler.handle(leaveRequest);
        thirdHandler.handle(leaveRequest);

        System.out.println("==========raise Request==========");
        firstHandler.handle(raiseRequest);
        secondHandler.handle(raiseRequest);
        thirdHandler.handle(raiseRequest);

        System.out.println("==========resign Request==========");
        firstHandler.handle(resignRequest);
        secondHandler.handle(resignRequest);
        thirdHandler.handle(resignRequest);
    }
}
