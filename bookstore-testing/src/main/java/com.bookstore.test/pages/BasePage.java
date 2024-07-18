package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * BasePage class represents the foundational class for all page objects in the Selenium tests.
 * It initializes the WebDriver instance and PageFactory for page object initialization.
 */
public class BasePage {
    protected WebDriver driver;

    /**
     * Constructor to initialize the WebDriver instance and PageFactory for the page object.
     * @param driver The WebDriver instance used to interact with the browser.
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
