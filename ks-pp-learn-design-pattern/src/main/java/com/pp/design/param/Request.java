package com.pp.design.param;

import com.pp.design.enums.RequestTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gupp
 * @date 2022/5/28 22:07
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private RequestTypeEnum requestType;

}
