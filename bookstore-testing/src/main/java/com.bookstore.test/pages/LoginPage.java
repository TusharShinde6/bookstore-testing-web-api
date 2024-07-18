package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * LoginPage class represents the page object for the login page of the bookstore application.
 * It extends the BasePage class and includes methods to interact with login elements.
 */
public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-btn")
    private WebElement loginButton;

    /**
     * Constructor to initialize the WebDriver instance for the LoginPage.
     * @param driver The WebDriver instance used to interact with the browser.
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Performs login action with provided username and password.
     * @param username The username to be entered into the username input field.
     * @param password The password to be entered into the password input field.
     */
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
