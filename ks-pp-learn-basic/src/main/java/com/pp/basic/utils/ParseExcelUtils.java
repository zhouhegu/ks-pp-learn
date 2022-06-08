package com.pp.basic.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gupp
 * @date 2022/6/8 23:46
 */
public class ParseExcelUtils {

    public static void parseExcel(String excelPath) {
        List<String> list = new ArrayList<>();
        File excel = new File(excelPath);
        try {
            if (excel.isFile() && excel.exists()) {
                Workbook workbook;
                String suffix = Arrays.asList(excel.getName().split("\\.")).get(1);
                if ("xls".equals(suffix)) {
                    FileInputStream fileInputStream = new FileInputStream(excel);
                    workbook = new HSSFWorkbook(fileInputStream);
                } else if ("xlsx".equals(suffix)) {
                    workbook = new XSSFWorkbook(excel);
                } else {
                    return;
                }
                // 读取第一个sheet
                Sheet sheet = workbook.getSheetAt(0);
                // 第一行为列名 跳过
                int firstRowIndex = sheet.getFirstRowNum() + 1;
                int lastRowIndex = sheet.getLastRowNum();
                for (int rowIndex = firstRowIndex; rowIndex <= lastRowIndex; rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row != null) {
                        int firstCellIndex = row.getFirstCellNum();
                        int lastCellIndex = row.getLastCellNum();
                        for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {
                            Cell cell = row.getCell(cIndex);
                            if (cell != null) {
                                System.out.println(cell);
                                // 如果元素为数字，防止解析变为科学计数法形式
                                DecimalFormat df = new DecimalFormat("0");
                                String num = df.format(cell.getNumericCellValue());
                                System.out.println(num);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
