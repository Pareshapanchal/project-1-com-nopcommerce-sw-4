package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();
    @Test
    //1.Test name verifyProductArrangeInAlphaBaticalOrder()
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException{
        // 1.1 Click on Computer Menu.
        computerPage.clickOnComputerFromTopMenu();
        // 1.2 Click on Desktop
        computerPage.clickOnDesktop();
        List<String > expectedList= computerPage.getExpectedList();
        // 1.3 Select Sort By position "Name: Z to A"
        String sortBy = "Name: A to Z";
        computerPage.sortTheDisplayTitlesFromSortBy(sortBy);
        //give time to sort out the titles
        computerPage.waitUntilTheSortByOptionSelection();
        // 1.4 Verify the Product will arrange in Descending order.
        List<String> acctualList = computerPage.getAcctualList();
        boolean message = expectedList.equals(acctualList);
        Assert.assertTrue(message);    }
    @Test
     //Test name verifyProductAddedToShoppingCartSuccessFully()
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
        //2.1 Click on Computer Menu.
        computerPage.clickOnComputerFromTopMenu();
        // 2.2 Click on Desktop
        computerPage.clickOnDesktop();
        // 2.3 Select Sort By position "Name: A to Z"
        String sortBy = "Name: A to Z";
        Thread.sleep(2000);
        computerPage.sortTheDisplayTitlesFromSortBy(sortBy);
        //give time to sort out the titles
        computerPage.waitUntilTheSortByOptionSelection();
        Thread.sleep(2000);
        // 2.4 Click on "Add To Cart"
        computerPage.clickOnAddtoCart();
        // 2.5 Verify the Text "Build your own computer"
        String expectedTitle = "Build your own computer";
        String actualTitle = computerPage.getAcctualTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Not at the right Page");
        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        String processorTitle = "2.2 GHz Intel Pentium Dual-Core E2200";
        computerPage.selectProcessor(processorTitle);
        // 2.7.Select "8GB [+$60.00]" using Select class.
        String ram ="8GB [+$60.00]";
        computerPage.selectRam(ram);
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.selectHdd();
        Thread.sleep(2000);
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.selectOS();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computerPage.setSelectSoftware("Microsoft Office [+$50.00]");
        Thread.sleep(2000);
        computerPage.clickOnTotalCommander();
        // 2.11 Verify the price "$1,475.00"
        Thread.sleep(2000);
        String expectedProductPrice = "$1,475.00";
        String actualProductPrice = computerPage.getActualProductPrice();
        Assert.assertEquals(actualProductPrice,expectedProductPrice,"Does not match");
        // 2.12 Click on "ADD TO CARD" Button.
        computerPage.clickOnAddToCartTotal();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Topgreen Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = computerPage.getActualProductAddedMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Not a Match");
        // After that close the bar clicking on the cross button.
        computerPage.setCloseTheBarButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computerPage.gotoSoppingCart();
        computerPage.clickOnGoToCart();
        // 2.15 Verify the message "Shopping cart"
        String expectedMessage1 ="Shopping cart";
        String actualMessage1 =computerPage.getShoppingCartMessage();
        Assert.assertEquals(actualMessage1,expectedMessage1,"Not Match");
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(2000);
        computerPage.changeQuantity("2");
        computerPage.clickOnUpdateShoppingCartButton();
        // 2.17 Verify the Total"$2,950.00"
        String expectedTotal ="$2,950.00";
        String actualTotal = computerPage.getTotal();
        Assert.assertEquals(actualTotal,expectedTotal,"Not Match");
        // 2.18 click on checkbox “I agree with the terms of service”
        computerPage.clickOnTearmsAndCondition();
        // 2.19 Click on “CHECKOUT”
        computerPage.clickOnCheckoutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedWelcomeMessage ="Welcome, Please Sign In!";
        String actualWelcomeMessage = computerPage.getWelcomeMessage();
        Assert.assertEquals(actualWelcomeMessage,expectedWelcomeMessage,"Not Match");
        // 2.21Click on “CHECKOUT AS GUEST” Tab
        computerPage.clickOnCheckoutAsGuest();
        // 2.22 Fill the all mandatory field
        computerPage.fillFirstnameLastnameEmailPhonenumber("Jeena","Shah","Jeena@gmail.com","125642111");
        computerPage.fillCountry("United States");
        Thread.sleep(200);
        computerPage.fillState("Florida");
        Thread.sleep(200);
        computerPage.fillCity("NewYork");
                computerPage.fillFirstlineAddressPostcode("5,LastRoad","NW2 4GH");
        // 2.23 Click on “CONTINUE”
        computerPage.clickOnContinueButton();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        computerPage.clickOnNextDayAir();
        // 2.25 Click on “CONTINUE”
        computerPage.clickOnContinueButtonShipping();
        // 2.26 Select Radio Button “Credit Card”
        computerPage.clickOnCreditCardRadioButton();
        computerPage.clickOnContinueButtonPaymentMethod();
        // 2.27 Select “Master card” From Select credit card dropdown
        computerPage.selectMasterCardFromSelectCreditCard();
        // 2.28 Fill all the details
        computerPage.sendCardHolderNameAndCardNumber("Mrs J Shah","5425233430109903");
        computerPage.sendCardExpiryMonthAndYear("05","2025");
        computerPage.sendCardCode("123");
        // 2.29 Click on “CONTINUE”
        computerPage.clickOnContinueButtonOnPaymentInfoPage();
        // 2.30 Verify “Payment Method” is “Credit Card”
        String expectedPaymet="Payment Method: Credit Card";
        String actualPayment = computerPage.getPaymentMethodIsCreditCard();
        Assert.assertEquals(actualPayment,expectedPaymet,"not match");
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShipping ="Shipping Method: Next Day Air";
        String actualShipping = computerPage.getShippingMethodIsNextDayAir();
        Assert.assertEquals(actualShipping,expectedShipping,"not match");
        // 2.33 Verify Total is “$2,950.00”
        String expectedTotalcost ="$2,950.00";
        String actualTotalCost = computerPage.getTotalAmount();
        Assert.assertEquals(actualTotalCost,expectedTotalcost,"Not Match");
        // 2.34 Click on “CONFIRM”
        computerPage.clickOnConfirmButton();
        // 2.35 Verify the Text “Thank You”
        String expectedThankYou ="Thank you";
        String actualThankYou = computerPage.getThankYouText();
        Assert.assertEquals(actualThankYou,expectedThankYou,"not match");
        // 2.36 Verify the message “Your order has been successfully processed!”
        String expectedOrderComplete ="Your order has been successfully processed!";
        String actualOrderComplete= computerPage.getOrderSuccessfullyMessage();
        Assert.assertEquals(actualOrderComplete,expectedOrderComplete,"Not Match");
        // 2.37 Click on “CONTINUE”
        computerPage.clickOnContinueButtonOrderComplete();
        // 2.37 Verify the text “Welcome to our stor
        String expectedWelcomeStore ="Welcome to our store";
        String actualWelcomeStore= computerPage.getWelcomeStoreMessage();
        Assert.assertEquals(actualWelcomeStore,expectedWelcomeStore,"Not match");
    }
}
