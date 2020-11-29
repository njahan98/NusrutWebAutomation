package com.walmart;

import com.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "global-search-input")
    private WebElement searchBar;

    @FindBy(xpath = "(//span[@class='b_a aa_b b_g b_b b_p w_a w_h w_i'])")
    private WebElement mainAccountButton;

    @FindBy(xpath = "(//span[@class='i_a i_c'])")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='w_a w_i']")
    private WebElement accountButton;

    @FindBy(linkText = "create an account")
    private WebElement createAnAccount;


    @Test
    public void userClickingAccountButton() {
        mainAccountButton.click();
    }

    @Test
    public void userClickingSignInButton() {
        signInButton.click();
    }

    @Test
    public void userHittingAccountButton() {
        accountButton.click();
    }

    @Test
    public void userPressingCreateAccount() {
        createAnAccount.click();
        sleepFor(2);
        closeDriver();
    }

}
