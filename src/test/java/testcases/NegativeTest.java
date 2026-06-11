package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class NegativeTest extends BaseTest {

    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wronguser123", "wrongpass123");

        Assert.assertTrue(driver.getPageSource().contains("The username and password could not be verified"),
                "Invalid login error message was not displayed");
    }

    @Test
    public void emptyLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("", "");

        Assert.assertTrue(driver.getPageSource().contains("Please enter a username and password"),
                "Empty login validation message was not displayed");
    }
}