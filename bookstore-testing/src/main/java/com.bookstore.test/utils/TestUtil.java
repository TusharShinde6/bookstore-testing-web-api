package com.bookstore.test.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUtil {
    private static final String TESTDATA_SHEET_PATH = "src/test/resources/testData.xlsx";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestUtil.class);

    /**
     * Reads test data from the specified Excel sheet and returns it as a list of object arrays.
     *
     * @param sheetName the name of the Excel sheet to read data from
     * @return a list of object arrays containing the test data
     */
    public static List<Object[]> getTestData(String sheetName) {
        List<Object[]> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Iterator<Row> rows = sheet.iterator();
            rows.next(); // Skip the header row

            // Iterate through each row and extract the cell data
            while (rows.hasNext()) {
                Row row = rows.next();
                String[] rowData = new String[row.getLastCellNum()];
                for (int i = 0; i < row.getLastCellNum(); i++) {
                    rowData[i] = row.getCell(i).toString();
                }
                data.add(rowData);
            }
        } catch (IOException e) {
            // Log the exception with context and rethrow as a custom exception
            LOGGER.error("Error reading test data from sheet: " + sheetName, e);
            throw new TestDataException("Failed to read test data from Excel file", e);
        }
        return data;
    }

    /**
     * Custom exception class for handling test data-related exceptions.
     */
    public static class TestDataException extends RuntimeException {
        /**
         * Constructs a new TestDataException with the specified detail message and cause.
         *
         * @param message the detail message
         * @param cause the cause of the exception
         */
        public TestDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}