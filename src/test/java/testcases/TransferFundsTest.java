package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.LoginPage;
import pages.RegisterPage;

public class TransferFundsTest extends BaseTest {

    @Test(dataProvider = "registrationData", dataProviderClass = TestDataProvider.class)
    public void verifyFundTransfer(
            String firstName, String lastName, String address,
            String city, String state, String zipCode,
            String phone, String ssn, String password) {

        RegisterPage registerPage = new RegisterPage(driver);

        String username = firstName.toLowerCase() + System.currentTimeMillis();

        registerPage.registerUser(firstName, lastName, address, city, state, zipCode, phone, ssn, username, password);

        Assert.assertTrue(driver.getPageSource().contains("Your account was created successfully"));

        driver.findElement(By.linkText("Log Out")).click();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        driver.get("https://parabank.parasoft.com/parabank/transfer.htm");

        Assert.assertTrue(driver.getPageSource().contains("Transfer Funds"));
        Assert.assertTrue(driver.findElement(By.id("amount")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("fromAccountId")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("toAccountId")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Transfer']")).isDisplayed());

        System.out.println("Transfer Funds page verified successfully");
    }
}