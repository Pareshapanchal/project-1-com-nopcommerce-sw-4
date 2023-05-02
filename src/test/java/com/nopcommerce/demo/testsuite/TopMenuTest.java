package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
    String menu = "Computers";
    @Test
    //This method will click on the selected title from the menu list
    // and verify the navigation of the page
    public void verifyPageNavigation()throws InterruptedException{

        topMenuPage.selectMenu(menu);

        String acctualPageTitle = topMenuPage.getPageTitle();
        String expectedPageTitle = menu;
        Assert.assertEquals(acctualPageTitle,expectedPageTitle,"Title doesn't match");
    }


}


