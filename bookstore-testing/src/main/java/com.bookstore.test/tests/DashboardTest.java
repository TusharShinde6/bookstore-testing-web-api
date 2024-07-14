package com.bookstore.test.tests;

import com.bookstore.test.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    @Test
    public void testDashboard() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        String welcomeMessage = dashboardPage.getWelcomeMessage();
        Assert.assertEquals(welcomeMessage, "Welcome, [username]!");
        dashboardPage.goToAddBookPage();
        // Add more interactions and assertions as needed
    }
}
