package com.bookstore.test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * BaseTest class serves as the base for all test classes in the bookstore application test suite.
 * It sets up and tears down the WebDriver instance using ChromeDriver.
 */
public class BaseTest {
    protected WebDriver driver;

    /**
     * Setup method to initialize the WebDriver instance before each test method.
     * It maximizes the browser window and navigates to the application URL.
     */
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://your-web-app-url.com");
    }

    /**
     * Teardown method to quit the WebDriver instance after each test method.
     */
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
