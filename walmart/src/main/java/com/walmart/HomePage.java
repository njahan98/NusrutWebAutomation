package com.walmart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id="global-search-input")
    private WebElement searchBar;

    public void typeOnSearchBar(){
        searchBar.sendKeys("Makeup");
    }
}
