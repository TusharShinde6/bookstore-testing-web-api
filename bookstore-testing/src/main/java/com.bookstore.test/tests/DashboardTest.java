package com.bookstore.test.tests;

import com.bookstore.test.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DashboardTest class contains test cases for testing the dashboard functionality of the bookstore application.
 * It extends BaseTest to utilize the WebDriver setup and teardown methods.
 */
public class DashboardTest extends BaseTest {

    /**
     * Test case to verify the functionality of the user dashboard.
     * It verifies the welcome message and performs navigation to add book page.
     */
    @Test
    public void testDashboard() {
        DashboardPage dashboardPage = new DashboardPage(driver);

        // Verify welcome message
        String welcomeMessage = dashboardPage.getWelcomeMessage();
        Assert.assertEquals(welcomeMessage, "Welcome, [username]!", "Verify welcome message");

        // Navigate to add book page
        dashboardPage.goToAddBookPage();

        // Add more interactions and assertions as needed for further tests on the dashboard
    }
}
