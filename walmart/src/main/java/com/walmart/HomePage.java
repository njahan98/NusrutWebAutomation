package com.walmart;

import com.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(id = "global-search-input")
    private WebElement searchBar;
    @FindBy(id = "global-search-submit")
    private WebElement searchButton;
    @FindBy(linkText = "Walmart.com")
    private WebElement homePageButton;
    @FindBy(linkText = "Add to cart")
    private WebElement addToCart;
    @FindBy(xpath = "(//span[@class='icon-button-children'])")
    private WebElement beautySideBar;
    @FindBy(linkText = "Eye Makeup")
    private WebElement eyeMakeupButton;


    public void typeOnSearchBar() {
        searchBar.sendKeys("Makeup");
        searchButton.click();
    }

    public void searchForItem() {
        typeOnSearchBar();
        searchButton.click();
    }

    public void openBeautySideBar() {
        searchForItem();
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollintoView(true);", beautySideBar);
        beautySideBar.click();
    }

    public void clickEyeMakeup() {
        openBeautySideBar();
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollintoView(true);", eyeMakeupButton);
        eyeMakeupButton.click();
    }

}
