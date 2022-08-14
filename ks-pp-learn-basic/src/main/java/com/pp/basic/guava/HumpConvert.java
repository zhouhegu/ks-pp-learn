package com.pp.basic.guava;

import com.google.common.base.CaseFormat;

/**
 * @author gupp
 * @date 2022/8/14 18:32
 *
 * 驼峰和下划线互转
 */
public class HumpConvert {

    /**
     * 驼峰转下划线
     */
    public static String convertHumpToLine(String str) {
        String resultStr = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str);
        System.out.println(str + "===驼峰转下划线===" + resultStr);
        return resultStr;
    }

    /**
     * 下划线转驼峰
     */
    public static String convertLineToHump(String str) {
        String resultStr = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
        System.out.println(str + "===下划线转驼峰===" + resultStr);
        return resultStr;
    }

    public static void main(String[] args) {
        System.out.println(convertHumpToLine("goodJob"));
        System.out.println(convertLineToHump("good_job"));
    }
}
