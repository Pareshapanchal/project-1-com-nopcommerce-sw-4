package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    //This xpath will give you list of titles on the top menu bar
    By topMenuList = By.xpath("//ul[@class='top-menu notmobile']/li");
    //This xpath will give you title of the page
    By pageTitle = By.xpath("//div[@class='page-title']");
    //This method will select title from the top menu bar
    public void selectMenu(String menu) {
            selectAndClickOnTheElementFromTheList(topMenuList,menu);
    }
    //This method will return the title of the page
    public String getPageTitle(){
     return getTextFromElement(pageTitle);
    }
}
