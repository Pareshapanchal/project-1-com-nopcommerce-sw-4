package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLlink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    public void clickOnLoginLink(){
        clickOnElement(loginLlink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}
