package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageTitle() {

        Assert.assertTrue(
                driver.getTitle().contains("ParaBank"));

        System.out.println("Login Page Loaded Successfully");
    }
}