package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtil;

public class TransferFundsPage {

    WebDriver driver;
    WaitUtil wait;

    By transferFundsLink = By.linkText("Transfer Funds");
    By amountField = By.id("amount");
    By fromAccount = By.id("fromAccountId");
    By toAccount = By.id("toAccountId");
    By transferButton = By.xpath("//input[@value='Transfer']");
    By successText = By.xpath("//*[contains(text(),'Transfer Complete')]");

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtil(driver);
    }

    public void openTransferFundsPage() {
        wait.waitForClickable(driver.findElement(transferFundsLink));
        driver.findElement(transferFundsLink).click();
    }

    public void transferAmount(String amount) {
        wait.waitForVisible(driver.findElement(amountField));

        driver.findElement(amountField).clear();
        driver.findElement(amountField).sendKeys(amount);

        Select from = new Select(driver.findElement(fromAccount));
        Select to = new Select(driver.findElement(toAccount));

        from.selectByIndex(0);

        if (to.getOptions().size() > 1) {
            to.selectByIndex(1);
        } else {
            to.selectByIndex(0);
        }

        wait.waitForClickable(driver.findElement(transferButton));
        driver.findElement(transferButton).click();
    }

    public boolean isTransferSuccessful() {
        return driver.getPageSource().contains("Transfer Complete")
                || driver.getPageSource().contains("has been transferred");
    }
}