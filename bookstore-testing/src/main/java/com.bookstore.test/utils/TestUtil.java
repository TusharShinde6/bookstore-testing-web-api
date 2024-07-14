package com.bookstore.test.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUtil {
    private static final String TESTDATA_SHEET_PATH = "src/test/resources/testData.xlsx";

    public static List<Object[]> getTestData(String sheetName) {
        List<Object[]> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Iterator<Row> rows = sheet.iterator();
            rows.next(); // Skip the header row

            while (rows.hasNext()) {
                Row row = rows.next();
                String[] rowData = new String[row.getLastCellNum()];
                for (int i = 0; i < row.getLastCellNum(); i++) {
                    rowData[i] = row.getCell(i).toString();
                }
                data.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
