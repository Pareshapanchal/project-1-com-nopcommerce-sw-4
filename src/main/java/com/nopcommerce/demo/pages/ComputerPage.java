package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computer =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By positionDropDown =By.xpath("//select[@name='products-orderby']");
    By productTitle = By.xpath("//h2[@class='product-title']");
    By addToCartButton =By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    By buildYourOwnTitle =By.xpath("//h1[normalize-space()='Build your own computer']");
    By processor =By.xpath("//select[@id='product_attribute_1']");
    By ram =By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaPremium =By.xpath("//input[@id='product_attribute_4_9']");
  By selectSoftware =By.xpath("//input[@type='checkbox']");
  By softwareTotalCommander =By.xpath("//input[@id='product_attribute_5_12']");
  By productPrice =By.xpath("//span[@class='price-value-1']");
  By addToCart =By.xpath("//button[@id='add-to-cart-button-1']");
  By productAddedToCartMessage = By.xpath("//p[@class='content']");
  By closeTheBarButton = By.xpath("//span[@title='Close']");
  By shoppingCart = By.xpath("//span[@class='cart-label']");
  By gotoCart =By.xpath("//button[normalize-space()='Go to cart']");
  By shoppingCartMessage = By.xpath("//h1[normalize-space()='Shopping cart']");
  By quantity = By.xpath("//input[@class='qty-input']");
  By updateCartButton =By.id("updatecart");
  By total = By.xpath("//tr[@class='order-total']//span[@class='value-summary']");
  By tearmsAndCondition = By.id("termsofservice");
  By checkoutButton = By.id("checkout");
  By welcomeMessage =By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
  By checkOutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
  By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
  By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
  By email = By.xpath("//input[@id='BillingNewAddress_Email']");
  By country = By.xpath("//select[@name='BillingNewAddress.CountryId']");

  By state = By.xpath("//select[@name='BillingNewAddress.StateProvinceId']");
  By city = By.xpath("//input[@id='BillingNewAddress_City']");
  By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
  By postCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
  By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
  By continueButton =By.xpath("//button[@onclick='Billing.save()']");
  By nextDayAir = By.id("shippingoption_1");
  By shippingContinueButton =By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
  By creditCardRadioButton =By.id("paymentmethod_1");

  By continueButtonPaymentMethod =By.xpath("//button[@class='button-1 payment-method-next-step-button']");
  By masterCard =By.xpath("//select[@id='CreditCardType']");
  By cardHolderName =By.id("CardholderName");
  By cardNumber =By.id("CardNumber");
  By cardExpiryMonth =By.xpath("//select[@id='ExpireMonth']");
  By cardYear =By.xpath("//select[@id='ExpireYear']");
  By cardCode =By.id("CardCode");
  By continueButtonPaymentInfo =By.xpath("//button[@class='button-1 payment-info-next-step-button']");
  By paymentMethod =By.xpath("//li[@class='payment-method']");
  By shippingMethodMessage = By.xpath("//li[@class='shipping-method']");
  By totalCost =By.xpath("//span[@class='value-summary']");
  By confirmButton =By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
  By thankYouText =By.xpath("//h1[normalize-space()='Thank you']");
  By orderSuccessfully =By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
  By continueButtonOrderComplete =By.xpath("//button[@class='button-1 order-completed-continue-button']");
  By welcomeStore =By.xpath("//h2[normalize-space()='Welcome to our store']");
    public void clickOnComputerFromTopMenu(){ mouseHoverOnElement(computer); }
    public void clickOnDesktop(){ mouseHoverOnElementAndClick(desktop); }
    public List<String> getExpectedList(){
        List<String> expectedTitle = getTheListOfElementFromTheList(productTitle);
        Collections.sort(expectedTitle);
        return expectedTitle;
    }
    public void sortTheDisplayTitlesFromSortBy(String text){
        selectByVisibleTextFromDropDown(positionDropDown,text);
    }
    public void waitUntilTheSortByOptionSelection(){
        waitUntilVisibilityOfElementLocated(positionDropDown,200);
    }
    public List<String> getAcctualList(){
        List<String> acctualList = getTheListOfElementFromTheList(productTitle);
                return acctualList;
    }
    public void clickOnAddtoCart(){ clickOnElement(addToCartButton);  }
    public void clickOnAddToCartTotal(){
        clickOnElement(addToCart);
    }
    public String getAcctualTitle(){
        String acctualTitle = getTextFromElement(buildYourOwnTitle);
        return acctualTitle;
    }
    public void selectProcessor(String processorTitle){
        selectByVisibleTextFromDropDown(processor,processorTitle);
    }
    public void selectRam(String ramTitle){  selectByVisibleTextFromDropDown(ram,ramTitle);}
    public void selectHdd(){
        clickOnElement(hdd);
    }
    public void selectOS(){
        clickOnElement(vistaPremium);
    }
    public void setSelectSoftware(String softwareName){
        selectAndClickOnTheElementFromTheList(selectSoftware,softwareName);
    }
    public void clickOnTotalCommander(){
      clickOnElement(softwareTotalCommander);
    }
    public String getActualProductPrice(){
        return getTextFromElement(productPrice);
    }
    public String getActualProductAddedMessage(){
        return getTextFromElement(productAddedToCartMessage);
    }
    public void setCloseTheBarButton(){
        clickOnElement(closeTheBarButton);
    }
    public void gotoSoppingCart(){
        mouseHoverOnElement(shoppingCart);
    }
    public void clickOnGoToCart(){
    clickOnElement(gotoCart);
    }
    public String getShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void changeQuantity(String value ){
        clearTheBox(quantity);
        sendTextToElement(quantity,value);
    }
    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateCartButton);
    }
    public String getTotal(){
        return getTextFromElement(total);
    }
    public void clickOnTearmsAndCondition(){
        clickOnElement(tearmsAndCondition);
}
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
}
    public String getWelcomeMessage(){
    return getTextFromElement(welcomeMessage); }
    public void clickOnCheckoutAsGuest(){
        clickOnElement(checkOutAsGuestButton);
    }
    public void fillFirstnameLastnameEmailPhonenumber(String firstname, String lastname, String email1, String phonenumber){
        sendTextToElement(firstName,firstname);
        sendTextToElement(lastName,lastname);
        sendTextToElement(email,email1);
        sendTextToElement(phoneNumber,phonenumber);
    }
    public void fillCountry(String country1){
        selectByVisibleTextFromDropDown(country,country1);}
    public void fillState(String state1){
        selectByVisibleTextFromDropDown(state,state1);
    }
    public void fillCity(String city1){
        sendTextToElement(city,city1);
    }
    public void fillFirstlineAddressPostcode(String firstlineaddress,String postcode){
        sendTextToElement(address1,firstlineaddress);
        sendTextToElement(postCode,postcode);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAir(){
        clickOnElement(nextDayAir);
    }
    public void clickOnContinueButtonPayementMethodPage(){
        clickOnElement(continueButtonPaymentMethod);
    }
    public void clickOnContinueButtonShipping(){
        clickOnElement(shippingContinueButton);
    }
    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }
    public void clickOnContinueButtonPaymentMethod(){
        clickOnElement(continueButtonPaymentMethod);
    }
    public void selectMasterCardFromSelectCreditCard(){
        selectByVisibleTextFromDropDown(masterCard,"Master card");
    }
    public void sendCardHolderNameAndCardNumber(String name, String creditcardnumber){
        sendTextToElement(cardHolderName,name);
        sendTextToElement(cardNumber,creditcardnumber);
    }
    public void sendCardExpiryMonthAndYear(String month, String year){
      selectByVisibleTextFromDropDown(cardExpiryMonth,month);
        selectByVisibleTextFromDropDown(cardYear,year);
    }
    public void sendCardCode(String cCode){
      sendTextToElement(cardCode,cCode);
    }
    public void clickOnContinueButtonOnPaymentInfoPage(){
        clickOnElement(continueButtonPaymentInfo);
    }
    public String getPaymentMethodIsCreditCard(){
        return getTextFromElement(paymentMethod);
    }
    public String getShippingMethodIsNextDayAir(){
        return getTextFromElement(shippingMethodMessage);
    }
    public String getTotalAmount(){
        return getTextFromElement(totalCost);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }
    public String getOrderSuccessfullyMessage(){
        return getTextFromElement(orderSuccessfully);
    }
    public void clickOnContinueButtonOrderComplete(){
        clickOnElement(continueButtonOrderComplete);
    }
    public String getWelcomeStoreMessage(){
        return getTextFromElement(welcomeStore);
    }





}
