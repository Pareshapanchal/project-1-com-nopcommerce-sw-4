package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText ="Welcome, Please Sign In!";
        String acctualText = loginPage.getWelcomeText();
        Assert.assertEquals(acctualText,expectedText,"Login page not dispalyed");
    }

}
