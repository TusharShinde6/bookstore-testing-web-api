package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * HomePage class represents the page object for the home page of the bookstore application.
 * It extends the BasePage class and includes methods to navigate to login and registration pages.
 */
public class HomePage extends BasePage {
    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    /**
     * Constructor to initialize the WebDriver instance for the HomePage.
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on the 'Login' link to navigate to the login page.
     */
    public void goToLoginPage() {
        loginLink.click();
    }

    /**
     * Clicks on the 'Register' link to navigate to the registration page.
     */
    public void goToRegistrationPage() {
        registerLink.click();
    }
}
