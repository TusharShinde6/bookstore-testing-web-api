package com.bookstore.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * DashboardPage class represents the page object for the user dashboard in the bookstore application.
 * It extends the BasePage class and includes methods to interact with elements on the dashboard.
 */
public class DashboardPage extends BasePage {
    @FindBy(id = "welcome-message")
    private WebElement welcomeMessage;

    @FindBy(linkText = "Add Book")
    private WebElement addBookLink;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    /**
     * Constructor to initialize the WebDriver instance for the DashboardPage.
     * @param driver The WebDriver instance used to interact with the browser.
     */
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Retrieves the welcome message displayed on the dashboard.
     */
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    /**
     * Clicks on the 'Add Book' link to navigate to the add book page.
     */
    public void goToAddBookPage() {
        addBookLink.click();
    }

    /**
     * Logs out the user by clicking on the 'Logout' link.
     */
    public void logout() {
        logoutLink.click();
    }
}
