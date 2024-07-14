package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        loginLink.click();
    }

    public void goToRegistrationPage() {
        registerLink.click();
    }
}
