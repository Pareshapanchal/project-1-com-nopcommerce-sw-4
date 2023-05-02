package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;


public class ElectronicsPage extends Utility {
    By electronics =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhonesLink  =By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By cellphoneText =By.xpath("//h1[normalize-space()='Cell phones']");
    By listView    =By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020link =By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By getNokiaLumia1020Text =By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By price$349Text =By.xpath("//span[@id='price-value-20']");
    By  quantity =By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartButton =By.xpath("//button[@id='add-to-cart-button-20']");
    By productAddedText =By.xpath("//p[@class='content']");
    By crossButton =By.xpath("//span[@title='Close']");
    By shoppingCart =By.xpath("//span[@class='cart-label']");
    By goToCartButton =By.xpath("//button[normalize-space()='Go to cart']");
    By shoppingCartText =By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityText =By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]");
    By totalText =By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By registerLink =By.xpath("//h1[normalize-space()='Register']");
    By registernewButton =By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstNameField =By.xpath("//input[@id='FirstName']");
    By lastNameField=By.xpath("//input[@id='LastName']");
    By emailField=By.xpath("//input[@id='Email']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPassword =By.xpath("//input[@id='ConfirmPassword']");
    By registerButton =By.xpath("//button[normalize-space()='Register']");
    By registrationCompleteText =By.xpath("//div[@class='result']");
    By continueButton =By.xpath("//a[normalize-space()='Continue']");
    By  loginLink= By.xpath("//a[normalize-space()='Log in']");
    By loginEmailField = By.xpath("//input[@name='Email']");
    By loginPasswordField =By.xpath("//input[@name='Password']");
    By loginButton=By.xpath("//button[normalize-space()='Log in']");
    By termsAndConditionCheckbox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton =By.xpath("//button[@id='checkout']");
    By countryField= By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Field=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCodeField=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButtonBilling = By.xpath("//button[@onclick='Billing.save()']");
    By radioButton2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By continueButtonShipping = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardRadioButton =By.xpath("//input[@id='paymentmethod_1']");
    By cardOptions = By.id("CreditCardType");
    By cardHolderNameField=By.xpath("//input[@id='CardholderName']");
    By cardNumberField=By.xpath("//input[@id='CardNumber']");
    By expiryMonthField=By.xpath("//select[@id='ExpireMonth']");
    By expiryYearField =By.xpath("//select[@id='ExpireYear']");
    By cardCodeField =By.xpath("//input[@id='CardCode']");
    By continueButtonPaymentInfo= By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    By totalSummaryText = By.xpath("//span[@class='value-summary']");
    By confirmButton =By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By thankYouText =By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonComplete=By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By welcomeStoreText= By.xpath("//div[@class='topic-block-title']");
    By logoutLink = By.linkText("Log out");
    By welcomeSignin =By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerText =By.xpath("//h1[normalize-space()='Register']");
    By continueButtonPaymentmethod =By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    //**********************************Action Methods***************************************
    public void mouseHoverOnElectronics(){
        mouseHoverOnElement(electronics);
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public void clickOnRegistrationButton(){
        clickOnElement(registerButton);
    }
    public void mouseHoverAndClickOnCellPhones(){
        mouseHoverOnElementAndClick(cellPhonesLink);
    }
    public void clickOnListView(){
        clickOnElement(listView);
    }
    public void clickOnRadioButton2ndAir(){
        clickOnElement(radioButton2ndDayAir);
    }
    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020link);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverOnElement(shoppingCart);
    }
    public void clickOnContinueButtonShipping(){
        clickOnElement(continueButtonShipping);
    }

    public void clickOnGoToCart(){
        clickOnElement(goToCartButton);
    }
    public void clickOntermsAndConditionCheckbox(){
        clickOnElement(termsAndConditionCheckbox);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkoutButton);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnLoginbutton(){
        clickOnElement(loginButton);
    }
   public void clickOnContinueButtonOnBillingPage(){
        clickOnElement(continueButtonBilling);
   }
   public void clickOnRadioButtonCrditCard(){
        clickOnElement(creditCardRadioButton);
   }

    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }
    public void clickOnContinueButtonPaymentInfo(){
        clickOnElement(continueButtonPaymentInfo);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public void clickOnContinueButtonCompleted(){
        clickOnElement(continueButtonComplete);
    }
    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }
    public void clickOnContinuePaymentMethod(){
        clickOnElement(continueButtonPaymentmethod);
    }
    public void clickOnNokiaLumiaLink(){
        clickOnElement(nokiaLumia1020link);
    }



    //**********************************Get Values Methods***********************************
    public String getCellphonesText(){
        return getTextFromElement(cellphoneText);
    }
    public String getQuantityText(){
        return driver.findElement(quantityText).getAttribute("value");
    }
    public String getNokialumia1020Text(){
        return getTextFromElement(getNokiaLumia1020Text);
    }
    public String getProductAddedMessage(){
        return getTextFromElement(productAddedText);
    }
    public String getPrice349(){
        return getTextFromElement(price$349Text);
    }
    public String getTotalSummary(){
        return getTextFromElement(totalSummaryText);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText); }
    public String getTotal698Text(){
        return getTextFromElement(totalText); }
    public String getWelcomeSignInText(){
        return getTextFromElement(welcomeSignin);}
    public String getRegistrationCompleteText(){
        return getTextFromElement(registrationCompleteText); }
    public String getShoppinCartText(){
        return getTextFromElement(shoppingCartText); }
    public String getPaymentMethodText(){
        return getTextFromElement(paymentMethodText); }
    public String getShippingMethodText(){
        return getTextFromElement(shippingMethodText);}
    public String getTotal(){
        return getTextFromElement(totalText); }
    public String getThankYouText(){
        return getTextFromElement(thankYouText); }
    public String getYourOrderMessage(){
        return getTextFromElement(orderSuccessMessage); }
    public String getWelcomeStoreText(){
        return getTextFromElement(welcomeStoreText);   }
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    //**********************************Send Values Methods**********************************
    public void changeQuantity(String qty){
        clearTheBox(quantity);
        sendTextToElement(quantity,qty);
    }
    public void fillFirstNameLastNameField(String firstname,String lastname){
        sendTextToElement(firstNameField,firstname);
        sendTextToElement(lastNameField,lastname);
    }
    public void fillEmailField(String email){
        sendTextToElement(emailField,email);
    }
    public void fillPasswordAndConfirmPassword(String password,String confirmpassword){
        sendTextToElement(passwordField,password);
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void fillEmailFieldInLoginPage(String email){
        sendTextToElement(loginEmailField,email);
    }
    public void fillPasswordInLoginpage(String password){
        sendTextToElement(loginPasswordField,password);
    }
    public void fillAdress1(String address){
        sendTextToElement(address1Field,address);
    }
    public void fillCountry(String country){
        sendTextToElement(countryField,country);
    }
    public void fillCity(String city){
        sendTextToElement(cityField,city);
    }
    public void fillPostCode(String postcode){
        sendTextToElement(postCodeField,postcode);
    }
    public void fillPhoneNumber(String phonenumber){
        sendTextToElement(phoneNumberField,phonenumber);
    }
    public void fillCardHolderNameField(String name){
        sendTextToElement(cardHolderNameField,name);
    }
    public void fillCardNumberField(String cardnumber){
        sendTextToElement(cardNumberField,cardnumber);
    }
    public void fillExpiryMonthField(String month){
        sendTextToElement(expiryMonthField,month);
    }
    public void fillExpiryYearField(String year){
        sendTextToElement(expiryYearField,year);
    }
    public void fillCardcodeField(String cardcode){
        sendTextToElement(cardCodeField,cardcode);
    }
    //**********************************Select From DropDownMethods**************************
    public void selectVisaFromDropdown(String cardtype){
        selectByContainsTextFromDropDown(cardOptions,cardtype);
    }


}

