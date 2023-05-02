package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By errorMessage = By.xpath("//div[@class='error-message-container error']");

    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

}
