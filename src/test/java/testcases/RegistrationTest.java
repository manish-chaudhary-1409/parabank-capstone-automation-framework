package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.LoginPage;
import pages.RegisterPage;

public class RegistrationTest extends BaseTest {

    @Test(dataProvider = "registrationData", dataProviderClass = TestDataProvider.class)
    public void registerNewUserAndVerifyLogin(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zipCode,
            String phone,
            String ssn,
            String password) {

        RegisterPage registerPage = new RegisterPage(driver);

        String username = firstName.toLowerCase() + System.currentTimeMillis();

        registerPage.registerUser(
                firstName,
                lastName,
                address,
                city,
                state,
                zipCode,
                phone,
                ssn,
                username,
                password
        );

        System.out.println("Created Username: " + username);
        System.out.println("After Registration Page Title: " + driver.getTitle());
        System.out.println("After Registration URL: " + driver.getCurrentUrl());

        Assert.assertTrue(
                driver.getPageSource().contains("Your account was created successfully"),
                "Registration was not successful"
        );

        driver.findElement(By.linkText("Log Out")).click();

        System.out.println("Logout completed");

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        System.out.println("After Login Page Title: " + driver.getTitle());
        System.out.println("After Login URL: " + driver.getCurrentUrl());

        Assert.assertTrue(
                driver.getPageSource().contains("Accounts Overview")
                        || driver.getTitle().contains("Accounts Overview"),
                "Login was not successful"
        );

        System.out.println("User registered and logged in successfully: " + username);
    }
}