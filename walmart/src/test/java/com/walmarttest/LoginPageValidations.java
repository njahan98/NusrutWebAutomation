package com.walmarttest;

import com.base.TestBase;
import com.walmart.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {

    @Test(groups = "regression")
    public void validateUserClickingAccountButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userClickingAccountButton();
    }

    @Test(groups = "smoke")
    public void validateUserClickingSignInButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userClickingSignInButton();
    }

    @Test(groups = "regression")
    public void validateUserHittingAccountButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userHittingAccountButton();
    }

    @Test(groups = "smoke")
    public void validateUserPressingCreateAccount() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userPressingCreateAccount();
    }

}
