package com.bookstore.test.tests;

import com.bookstore.test.pages.LoginPage;
import com.bookstore.test.utils.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

/**
 * LoginTest class contains test cases for testing the login functionality of the bookstore application.
 * It extends BaseTest to utilize the WebDriver setup and teardown methods.
 */
public class LoginTest extends BaseTest {

    /**
     * Data provider method to supply login test data from an external data source.
     * Uses TestUtil to fetch test data from "LoginData" sheet.
     */
    @DataProvider(name = "loginData")
    public Iterator<Object[]> loginData() {
        return TestUtil.getTestData("LoginData").iterator();
    }
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        // Add assertions to verify successful login or errors
    }
}
