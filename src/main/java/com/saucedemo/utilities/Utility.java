package com.saucedemo.utilities;

import com.saucedemo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String verifyVisibleText(By by) {
        return driver.findElement(by).getText();
    }

    public int countProductOnThePage(By by) {
        int totalProducts = driver.findElements(by).size();
        return totalProducts;
    }
}