package com.walmarttest;

import com.base.TestBase;
import com.walmart.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test
    public void validateUserTypingOnSearchBar(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.typeOnSearchBar();
    }
    @Test (enabled = false)
    public void validateUserSearchingForItem(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.searchForItem();
    }
    @Test
    public void validateUserOpeningBeautySideBar(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.openBeautySideBar();
    }
    @Test(enabled = false)
    public void validateUserClickingEyeMakeupButton(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickEyeMakeup();
    }
}
