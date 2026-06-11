package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtil;

public class AccountOverviewPage {

    WebDriver driver;
    WaitUtil wait;

    By accountOverviewTitle = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By accountLink = By.xpath("//table[@id='accountTable']//a");

    public AccountOverviewPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtil(driver);
    }

    public boolean isAccountOverviewDisplayed() {
        wait.waitForVisible(driver.findElement(accountOverviewTitle));
        return driver.findElement(accountOverviewTitle).isDisplayed();
    }

    public String getFirstAccountNumber() {
        wait.waitForVisible(driver.findElement(accountLink));
        return driver.findElement(accountLink).getText();
    }
}