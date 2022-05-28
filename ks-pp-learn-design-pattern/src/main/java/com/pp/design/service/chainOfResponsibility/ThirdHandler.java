package com.pp.design.service.chainOfResponsibility;

import com.pp.design.enums.RequestTypeEnum;
import com.pp.design.param.Request;
import org.springframework.stereotype.Service;

/**
 * @author gupp
 * @date 2022/5/28 22:32
 */
@Service("thirdHandler")
public class ThirdHandler extends CommonHandler{
    @Override
    public void handle(Request request) {
        System.out.println("Third handler can handle all request!");
    }
}
