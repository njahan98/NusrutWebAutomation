package com.walmarttest;

import com.base.TestBase;
import com.walmart.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(groups = "smoke")
    public void validateUserTypingOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(groups = "smoke")
    public void validateUserSearchingForItem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchForItem();
    }

    @Test(groups = "smoke")
    public void validateUserOpeningBeautySideBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openBeautySideBar();
    }

    @Test(groups = "regression")
    public void validateUserClickingEyeMakeupButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickEyeMakeup();
    }
}
