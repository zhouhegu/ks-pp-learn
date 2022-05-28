package com.pp.design.enums;

/**
 * @author gupp
 * @date 2022/5/28 22:11
 */
public enum RequestTypeEnum {

    LEAVE_REQUEST(1, "请假"),

    RAISE_REQUEST(2, "加薪"),

    RESIGN_REQUEST(3, "辞职");

    private final Integer code;

    private final String desc;

    RequestTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
