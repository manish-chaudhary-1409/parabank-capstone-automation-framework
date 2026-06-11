package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.BillPaymentPage;
import pages.LoginPage;
import pages.RegisterPage;

public class BillPaymentTest extends BaseTest {

    @Test(dataProvider = "registrationData",
          dataProviderClass = TestDataProvider.class)

    public void verifyBillPayment(
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

        String username =
                firstName.toLowerCase()
                        + System.currentTimeMillis();

        registerPage.registerUser(
                firstName,lastName,address,
                city,state,zipCode,
                phone,ssn,username,password);

        driver.findElement(
                org.openqa.selenium.By.linkText("Log Out"))
                .click();

        driver.get(
                "https://parabank.parasoft.com/parabank/index.htm");

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username,password);

        BillPaymentPage billPage =
                new BillPaymentPage(driver);

        billPage.openBillPayPage();

        billPage.payBill(
                "Electricity Board",
                "Delhi Road",
                "Aligarh",
                "UP",
                "202001",
                "9876543210",
                "123456",
                "500");

        Assert.assertTrue(
                billPage.isBillPaymentSuccessful());

        System.out.println("Bill Payment Successful");
    }
}