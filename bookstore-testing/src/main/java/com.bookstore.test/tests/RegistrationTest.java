package com.bookstore.test.tests;

import com.bookstore.test.pages.RegistrationPage;
import com.bookstore.test.utils.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class RegistrationTest extends BaseTest {

    @DataProvider(name = "registrationData")
    public Iterator<Object[]> registrationData() {
        return TestUtil.getTestData("RegistrationData").iterator();
    }

    @Test(dataProvider = "registrationData")
    public void testRegistration(String username, String email, String password) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register(username, email, password);
        // Add assertions to verify successful registration or errors
    }
}
