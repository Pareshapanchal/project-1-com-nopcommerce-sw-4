package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    @Test
    //1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
    // 1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.mouseHoverOnElectronics();
    // 1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverAndClickOnCellPhones();
    // 1.3 Verify the text “Cell phones”
        String expectedCellphonesText ="Cell phones";
        String actualCellphonesText =electronicsPage.getCellphonesText();
        Assert.assertEquals(actualCellphonesText,expectedCellphonesText,"Not match");
        }
        @Test
    // 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
    // 2.1 Mouse Hover on “Electronics” Tab
            electronicsPage.mouseHoverOnElectronics();
    // 2.2 Mouse Hover on “Cell phones” and click
            Thread.sleep(1000);
            electronicsPage.mouseHoverAndClickOnCellPhones();

    // 2.3 Verify the text “Cell phones”
            String expectedCellphonesText ="Cell phones";
            String actualCellphonesText =electronicsPage.getCellphonesText();
            Assert.assertEquals(actualCellphonesText,expectedCellphonesText,"Not match");
    // 2.4 Click on List View Tab
            electronicsPage.clickOnListView();
    // 2.5 Click on product name “Nokia Lumia 1020” link
            Thread.sleep(2000);
            electronicsPage.clickOnNokiaLumiaLink();
    // 2.6 Verify the text “Nokia Lumia 1020”
            String expectedNokiaText ="Nokia Lumia 1020";
            String actualNokiaText=electronicsPage.getNokialumia1020Text();
            Assert.assertEquals(actualNokiaText,expectedNokiaText,"Not Match");
    // 2.7 Verify the price “$349.00”
            String expectedPriceText ="$349.00";
            String actualPriceText = electronicsPage.getPrice349();
            Assert.assertEquals(actualPriceText,expectedPriceText,"Not Match");
    // 2.8 Change quantity to 2
            electronicsPage.changeQuantity("2");
    // 2.9 Click on “ADD TO CART” tab
            electronicsPage.clickOnAddToCartButton();
    // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    // After that close the bar clicking on the cross button.
            String expectedProductAddedMessage = "The product has been added to your shopping cart";
            String actualProductAddedMessage=electronicsPage.getProductAddedMessage();
            Assert.assertEquals(actualProductAddedMessage,expectedProductAddedMessage,"Not Match");
            electronicsPage.clickOnCrossButton();
            // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
            electronicsPage.mouseHoverOnShoppingCart();
            Thread.sleep(2000);
            electronicsPage.clickOnGoToCart();
            Thread.sleep(2000);
    // 2.12 Verify the message "Shopping cart"
            String expectedShoppingCartTitle ="Shopping cart";
            String actualShoppingCartTitle =electronicsPage.getShoppingCartText();
            Assert.assertEquals(actualShoppingCartTitle,expectedShoppingCartTitle,"Not Match");
    // 2.13 Verify the quantity is 2
            Thread.sleep(1000);
            String expectedQuantity ="2";
            String actualQuantity = electronicsPage.getQuantityText();
            Assert.assertEquals(actualQuantity,expectedQuantity,"Not Match");
    // 2.14 Verify the Total $698.00
            String expectedTotal ="$698.00";
            String actualTotal = electronicsPage.getTotal698Text();
            Assert.assertEquals(actualTotal,expectedTotal,"Not Match");

    // 2.15 click on checkbox “I agree with the terms of service”
            electronicsPage.clickOntermsAndConditionCheckbox();
    // 2.16 Click on “CHECKOUT”
            electronicsPage.clickOnCheckOutButton();
    // 2.17 Verify the Text “Welcome, Please Sign In!”
            String expectedWelcomeMessage ="Welcome, Please Sign In!";
            String actualWelcomeMessage = electronicsPage.getWelcomeSignInText();
            Assert.assertEquals(actualWelcomeMessage,expectedWelcomeMessage,"Not Match");
    // 2.18 Click on “REGISTER” tab
            Thread.sleep(2000);
            electronicsPage.clickOnRegisterButton();

    // 2.19 Verify the text “Register”

            String expectedRegisterTitle ="Register";
            String actualRegisterTitle = electronicsPage.getRegisterText();
            Assert.assertEquals(actualRegisterTitle,expectedRegisterTitle,"Not Match");
    // 2.20 Fill the mandatory fields
            electronicsPage.fillFirstNameLastNameField("jina","Joshi");
            electronicsPage.fillEmailField("jina@gmail.com");
            electronicsPage.fillPasswordAndConfirmPassword("sita123","sita123");
    // 2.21 Click on “REGISTER” Button
            electronicsPage.clickOnRegistrationButton();
    // 2.22 Verify the message “Your registration completed”
            String expectedRegistrationCompleteMessage ="Your registration completed";
            String actualRegistrationCompleteMessage = electronicsPage.getRegistrationCompleteText();
            Assert.assertEquals(actualRegistrationCompleteMessage,expectedRegistrationCompleteMessage,"Not Match");
    // 2.23 Click on “CONTINUE” tab
            electronicsPage.clickOnContinueButton();
    // 2.24 Verify the text “Shopping card”
                String expectedShoppingCart = "Shopping cart";
                String actualShoppingCart = electronicsPage.getShoppingCartText();
                Assert.assertEquals(actualShoppingCart,expectedShoppingCart,"Not Match");
                electronicsPage.clickOnLoginLink();
                electronicsPage.fillEmailFieldInLoginPage("jina@gmail.com");
                electronicsPage.fillPasswordInLoginpage("sita123");
                electronicsPage.clickOnLoginbutton();
    // 2.25 click on checkbox “I agree with the terms of service”
                electronicsPage.clickOntermsAndConditionCheckbox();
    // 2.26 Click on “CHECKOUT”
                electronicsPage.clickOnCheckOutButton();
    // 2.27 Fill the Mandatory fields
                electronicsPage.fillCountry("India");
                electronicsPage.fillCity("Ahmedabad");
                electronicsPage.fillAdress1("3,Manson Road");
                electronicsPage.fillPostCode("NW3 6HI");
                electronicsPage.fillPhoneNumber("1258985452");
    // 2.28 Click on “CONTINUE”
                electronicsPage.clickOnContinueButtonOnBillingPage();
    // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
                electronicsPage.clickOnRadioButton2ndAir();
    // 2.30 Click on “CONTINUE”
                electronicsPage.clickOnContinueButtonShipping();
    // 2.31 Select Radio Button “Credit Card”
                electronicsPage.clickOnRadioButtonCrditCard();
                electronicsPage.clickOnContinuePaymentMethod();
    // 2.32 Select “Visa” From Select credit card dropdown
                electronicsPage.selectVisaFromDropdown("Visa");
    // 2.33 Fill all the details
                electronicsPage.fillCardHolderNameField("Mrs S Shah");
                electronicsPage.fillCardNumberField("5425233430109903");
                electronicsPage.fillExpiryMonthField("02");
                electronicsPage.fillExpiryYearField("2025");
                electronicsPage.fillCardcodeField("123");
    // 2.34 Click on “CONTINUE”
                electronicsPage.clickOnContinueButtonPaymentInfo();
    // 2.35 Verify “Payment Method” is “Credit Card”
                String expectedPaymentMessage ="Payment Method: Credit Card";
                String acctualPaymentMessage =electronicsPage.getPaymentMethodText();
                Assert.assertEquals(acctualPaymentMessage,expectedPaymentMessage,"Not Match");
    // 2.36 Verify “Shipping Method” is “2nd Day Air”
                String expectedShippingMessage ="Shipping Method: 2nd Day Air";
                String actualShippingMessage = electronicsPage.getShippingMethodText();
                Assert.assertEquals(actualShippingMessage,expectedShippingMessage,"Not Match");
    // 2.37 Verify Total is “$698.00”
                String expectedTotalMessage = "$698.00";
                String actualTotalMessage = electronicsPage.getTotal698Text();
                Assert.assertEquals(actualTotalMessage,expectedTotalMessage,"Not Match");
    // 2.38 Click on “CONFIRM”
                electronicsPage.clickOnConfirmButton();
    // 2.39 Verify the Text “Thank You”
                String expectedThankYou ="Thank you";
                String actualThankYou = electronicsPage.getThankYouText();
                Assert.assertEquals(actualThankYou,expectedThankYou,"Not match");
    // 2.40 Verify the message “Your order has been successfully processed!”
                String expectedOrderSuccessfullMessage = "Your order has been successfully processed!";
                String actualOrderSuccessfullMessage = electronicsPage.getYourOrderMessage();
                Assert.assertEquals(actualOrderSuccessfullMessage,expectedOrderSuccessfullMessage,"Not match");
    // 2.41 Click on “CONTINUE”
                electronicsPage.clickOnContinueButtonCompleted();
    // 2.42 Verify the text “Welcome to our store”
                String expectedWelcomeStoreMessage ="Welcome to our store";
                String actualWelcomeStoreMessage =electronicsPage.getWelcomeStoreText();
                Assert.assertEquals(actualWelcomeStoreMessage,expectedWelcomeStoreMessage,"Not Match");
    // 2.43 Click on “Logout” link
                electronicsPage.clickOnLogoutLink();
    // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
                String currentUrl = driver.getCurrentUrl();
                String expectedUrl="https://demo.nopcommerce.com/";
                Assert.assertEquals(currentUrl,expectedUrl,"Not Match");
        }
}
