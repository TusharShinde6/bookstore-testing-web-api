package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(id = "welcome-message")
    private WebElement welcomeMessage;

    @FindBy(linkText = "Add Book")
    private WebElement addBookLink;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public void goToAddBookPage() {
        addBookLink.click();
    }

    public void logout() {
        logoutLink.click();
    }
}
