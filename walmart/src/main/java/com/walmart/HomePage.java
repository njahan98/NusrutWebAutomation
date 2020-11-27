package com.walmart;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends TestBase {

    private WebElement searchBar;

    @Test
    public void clickOnSearchBar(){
        navigateToURL("https://www.target.com");
        sleepFor(2);
        clickOnElement("(//input[@id='search'])"); ////input[@id='search']
        sleepFor(2);
    }
    @Test
    public void typeOnSearchBar(){
        driver.findElement(By.id("search")).sendKeys("Makeup");
        sleepFor(5);
        clickOnElement("(//input[@id='search'])");

    }

}