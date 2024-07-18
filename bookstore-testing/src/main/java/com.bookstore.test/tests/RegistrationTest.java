package com.bookstore.test.tests;

import com.bookstore.test.pages.RegistrationPage;
import com.bookstore.test.utils.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

/**
 * RegistrationTest class contains test cases for testing the registration functionality of the bookstore application.
 * It extends BaseTest to utilize the WebDriver setup and teardown methods.
 */
public class RegistrationTest extends BaseTest {

    /**
     * Data provider method to supply registration test data from an external data source.
     * Uses TestUtil to fetch test data from "RegistrationData" sheet.
     * @return Iterator of Object arrays containing username, email, and password combinations.
     */
    @DataProvider(name = "registrationData")
    public Iterator<Object[]> registrationData() {
        return TestUtil.getTestData("RegistrationData").iterator();
    }

    /**
     * Test case to perform registration with provided username, email, and password.
     * Uses data provider to run the test with multiple data sets.
     * @param username The username for registration.
     * @param email The email for registration.
     * @param password The password for registration.
     */
    @Test(dataProvider = "registrationData")
    public void testRegistration(String username, String email, String password) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register(username, email, password);
        // Add assertions to verify successful registration or errors
    }
}
