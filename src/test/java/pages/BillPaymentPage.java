package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtil;

public class BillPaymentPage {

    WebDriver driver;
    WaitUtil wait;

    By billPayLink = By.linkText("Bill Pay");
    By payeeName = By.name("payee.name");
    By address = By.name("payee.address.street");
    By city = By.name("payee.address.city");
    By state = By.name("payee.address.state");
    By zipCode = By.name("payee.address.zipCode");
    By phone = By.name("payee.phoneNumber");
    By account = By.name("payee.accountNumber");
    By verifyAccount = By.name("verifyAccount");
    By amount = By.name("amount");
    By sendPaymentButton = By.xpath("//input[@value='Send Payment']");
    By successText = By.xpath("//*[contains(text(),'Bill Payment Complete')]");

    public BillPaymentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtil(driver);
    }

    public void openBillPayPage() {
        wait.waitForClickable(driver.findElement(billPayLink));
        driver.findElement(billPayLink).click();
    }

    public void payBill(String name, String addr, String cityName, String stateName,
                        String zip, String phoneNo, String accNo, String billAmount) {

        wait.waitForVisible(driver.findElement(payeeName));

        driver.findElement(payeeName).sendKeys(name);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(phone).sendKeys(phoneNo);
        driver.findElement(account).sendKeys(accNo);
        driver.findElement(verifyAccount).sendKeys(accNo);
        driver.findElement(amount).sendKeys(billAmount);

        wait.waitForClickable(driver.findElement(sendPaymentButton));
        driver.findElement(sendPaymentButton).click();
    }

    public boolean isBillPaymentSuccessful() {
        wait.waitForVisible(driver.findElement(successText));
        return driver.getPageSource().contains("Bill Payment Complete");
    }
}