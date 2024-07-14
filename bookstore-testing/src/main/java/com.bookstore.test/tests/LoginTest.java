package com.bookstore.test.tests;

import com.bookstore.test.pages.LoginPage;
import com.bookstore.test.utils.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class LoginTest extends BaseTest {

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
