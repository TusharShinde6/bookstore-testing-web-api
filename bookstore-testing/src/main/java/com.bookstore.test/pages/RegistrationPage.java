package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "register-btn")
    private WebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void register(String username, String email, String password) {
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        registerButton.click();
    }
}
