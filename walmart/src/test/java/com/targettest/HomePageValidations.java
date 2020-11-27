package com.targettest;

import com.base.TestBase;
import com.walmart.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test
    public void validateUserTypingOnSearchBar(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSearchBar();
        homePage.typeOnSearchBar();

    }
}
