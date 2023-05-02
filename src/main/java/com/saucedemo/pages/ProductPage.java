package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productText = By.xpath("//span[text()='Products']");

    By countProduct = By.xpath("//div[@class='inventory_item_name']");

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public int totalProductsOnPage() {
      return  countProductOnThePage(countProduct);


}

    }
