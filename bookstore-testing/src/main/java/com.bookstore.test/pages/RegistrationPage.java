package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * RegistrationPage class represents the page object for the registration page of the bookstore application.
 * It extends the BasePage class and includes methods to interact with registration elements.
 */
public class RegistrationPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "register-btn")
    private WebElement registerButton;

    /**
     * Constructor to initialize the WebDriver instance for the RegistrationPage.
     */
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Performs registration action with provided username, email, and password.
     * @param username The username to be entered into the username input field.
     * @param email The email to be entered into the email input field.
     * @param password The password to be entered into the password input field.
     */
    public void register(String username, String email, String password) {
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        registerButton.click();
    }
}
