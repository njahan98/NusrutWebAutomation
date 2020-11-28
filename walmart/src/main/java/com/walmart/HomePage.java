package com.walmart;

import com.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(id = "global-search-input")
    private WebElement searchBar;
    @FindBy(id = "global-search-submit")
    private WebElement searchButton;
    @FindBy(linkText = "Walmart.com")
    private WebElement homePageButton;
    @FindBy(linkText = "Add to cart")
    private WebElement addToCart;


    public void typeOnSearchBar() {
        searchBar.sendKeys("Makeup");
        searchButton.click();
    }
    public void searchForItem() {
        searchBar.sendKeys("Makeup");
        searchButton.click();
        sleepFor(5);
        closeDriver();
    }


}
