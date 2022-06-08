package com.pp.basic.utils;

import com.pp.basic.KsPpBasicApplicationTest;
import org.junit.Test;

/**
 * @author gupp
 * @date 2022/6/9 00:05
 */
public class ParseExcelTest extends KsPpBasicApplicationTest {

    @Test
    public void testParseExcel() {
        String excelPath = "/Users/gupp/Desktop/test.xlsx";
        ParseExcelUtils.parseExcel(excelPath);
    }
}
