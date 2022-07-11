import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CheckoutPage extends Settings {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    final By verifyIdentityText = By.xpath("//h4[text()='Verify your identity']");
    final By firstNameField = By.id("textfield-firstName");
    final By lastNameField = By.id("textfield-lastName");
    final By emailField = By.id("textfield-email");
    final By phoneField = By.xpath("//input[@placeholder='Phone number']");
    final By iframePrivateStripeFrame = By.xpath("//iframe[contains(@name,'__privateStripeFrame')]");
    final By iframeLightboxApp = By.xpath("//iframe[@class='LightboxApp-content']");
    final By submitButton = By.id("testing-submit-autocomplete-button");
    final By continueButton = By.xpath("//div[contains(@class, 'success_pageButtons')]//button");
    final By confirmAddressButton = By.xpath("//button[@type='submit' and text()='confirm']");
    final By grossIncomeField = By.xpath("//input[@placeholder='Gross income']");
    final By privacyPolicyCheckbox = By.xpath("//input[@name='privacy-policy-checkbox']");
    final By consumerCheckbox = By.xpath("//input[@name='consumer-checkbox']");
    final By fairCheckbox = By.xpath("//input[@name='fair-checkbox']");
    final By checkMeButton = By.xpath("//button[@type='submit' and text()='check me']");
    final By uploadField = By.xpath("//input[contains(@id, 'fileUploader-document')]");
    final By inputInsuranceField = By.xpath("//input[@inputmode='numeric']");
    final By confirmInsuranceButton = By.xpath("//button[contains(@class,'submit')]");
    final By nextStepButton = By.xpath("//button[contains(@class, 'Button-root')]");
    final By insuranceCheckbox = By.xpath("//input[contains(@class,'PrivateSwitchBase-input') and @type='checkbox']");
    final By cardNumberField = By.xpath("//span[@class='InputContainer']/input[@name='cardnumber']");
    final By expiryDateField = By.xpath("//input[@name='exp-date']");
    final By cvcField = By.xpath("//input[@name='cvc']");
    final By subscriptionCheckbox = By.xpath("//input[@type='checkbox']");
    final By howDidYouHearAboutUsField = By.xpath("(//h4[text()='Select an option'])[1]");
    final By selectFacebook = By.xpath("(//li/h4)[3]");
    final By leaseOrPurchaseField = By.xpath("(//h4[text()='Select an option'])[1]");
    final By selectLease = By.xpath("(//li/h4)[3]");
    final By payButton = By.xpath("//div[contains(@class,'style_form_submit_btn')]/button[@type='submit']");
    final By selectPaymentFrame = By.xpath("(//iframe[contains(@name,'_privateStripeFrame')])[1]");
    final By selectCardNumberFrame = By.xpath("(//iframe[contains(@name,'_privateStripeFrame')])[2]");
    final By selectCVCFrame = By.xpath("(//iframe[contains(@name,'_privateStripeFrame')])[3]");
    final By successfullMessage = By.xpath("//h3[text()='Payment Successful']");
    final By changeAreaRadioButton = By.xpath("//input[contains(@class,'PrivateSwitchBase-input') and @value='no']");
    final By inputAddressField = By.id("textfield-addrFirstLine");
    final By inputCityField = By.id("textfield-city");
    final By inputApartmentField = By.id("textfield-addrSecondLine");
    final By inputStateField = By.name("state");
    final By inputZIPField = By.xpath("//input[@placeholder='Zipcode']");
    final By uploadResidencyDocuments = By.xpath("//input[contains(@id,'fileUploader-document')]");
    final By uploadRButton = By.xpath("//div[contains(@class,'upload_wrapper')]//button");
    final By removeUploadedFile = By.xpath("//a[contains(@class,'style_remove_button')]");
    final By goToSecondStepButton = By.xpath("//div[contains(@class,'form_submit_box')]//button");

    public CheckoutPage goToSecondStep() {
        driver.findElement(goToSecondStepButton).click();
        return this;
    }

    public CheckoutPage uploadDocuments(String path) {
        uploadFiles(driver, uploadResidencyDocuments, path);
        presenceOfElementLocated(driver, removeUploadedFile);
        return this;
    }

    public CheckoutPage inputZIP(String apartment) {
        driver.findElement(inputZIPField).sendKeys(apartment);
        return this;
    }

    public CheckoutPage inputApartment(String apartment) {
        driver.findElement(inputApartmentField).sendKeys(apartment);
        return this;
    }

    public CheckoutPage inputCity(String city) {
        driver.findElement(inputCityField).sendKeys(city);
        return this;
    }

    public CheckoutPage inputAddress(String address) {
        presenceOfElementLocated(driver, inputAddressField);
        driver.findElement(inputAddressField).sendKeys(address);
        return this;
    }

    public CheckoutPage selectChangeAreaRadioButton() {
        driver.findElement(changeAreaRadioButton).click();
        return this;
    }

    public CheckoutPage selectState(String state) {
        presenceOfElementLocated(driver, inputStateField);
        String id = driver.findElement(inputStateField).getAttribute("id");
        javascriptExecutor(driver, "document.getElementById('" + id + "').value = '" + state + "'");
        driver.findElement(inputStateField).sendKeys(state);
        driver.findElement(inputStateField).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(inputStateField).sendKeys(Keys.ENTER);
        return this;
    }


    public CheckoutPage checkText() {
        presenceOfElementLocated(driver, verifyIdentityText);
        return this;
    }

    public CheckoutPage inputFirstName(String firstname) {
        driver.findElement(firstNameField).sendKeys(firstname);
        return this;
    }

    public CheckoutPage inputLastName(String lastname) {
        driver.findElement(lastNameField).sendKeys(lastname);
        return this;
    }

    public CheckoutPage inputEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public CheckoutPage inputPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public CheckoutPage clickVerifyMeButton() {
        javascriptExecutor(driver, "document.getElementsByClassName('MuiButton-root')[0].click()");
        return this;
    }

    public CheckoutPage switchToFrame() {
        presenceOfElementLocated(driver, iframePrivateStripeFrame);
        driver.switchTo().frame(driver.findElement(iframePrivateStripeFrame));
        presenceOfElementLocated(driver, iframeLightboxApp);
        driver.switchTo().frame(driver.findElement(iframeLightboxApp));
        return this;
    }

    public CheckoutPage clickAcceptIdentityButton() {
        presenceOfElementLocated(driver, submitButton);
        driver.findElement(submitButton).click();
        return this;
    }

    public CheckoutPage clickContinueButton() {
        presenceOfElementLocated(driver, continueButton);
        driver.findElement(continueButton).click();
        return this;
    }

    public CheckoutPage switchToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }

    public CheckoutPage clickConfirmAddressButton() {
        presenceOfElementLocated(driver, confirmAddressButton);
        driver.findElement(confirmAddressButton).click();
        return this;
    }

    public CheckoutPage inputGrossIncome(String gross) {
        presenceOfElementLocated(driver, grossIncomeField);
        driver.findElement(grossIncomeField).sendKeys(gross);
        return this;
    }

    public CheckoutPage selectPrivacyPolicyCheckbox() {
        javascriptExecutorScroll(driver, privacyPolicyCheckbox);
        selectCheckbox(driver, privacyPolicyCheckbox);
        return this;
    }

    public CheckoutPage selectConsumerCheckbox() {
        selectCheckbox(driver, consumerCheckbox);
        return this;
    }

    public CheckoutPage selectFairCheckbox() {
        selectCheckbox(driver, fairCheckbox);
        return this;
    }


    public CheckoutPage clickCheckMeButton() {
        driver.findElement(checkMeButton).click();
        return this;
    }

    public CheckoutPage inputInsetance(String text) {
        presenceOfElementLocated(driver, inputInsuranceField);
        driver.findElement(inputInsuranceField).sendKeys(text);
        return this;
    }

    public CheckoutPage confirmInsuranceButton() {
        driver.findElement(confirmInsuranceButton).click();
        return this;
    }

    public CheckoutPage nextStepButton() {
        presenceOfElementLocated(driver, nextStepButton);
        driver.findElement(nextStepButton).click();
        return this;
    }

    public CheckoutPage selectInsuranceCheckbox() {
        presenceOfElementLocated(driver, insuranceCheckbox);
        selectCheckbox(driver, insuranceCheckbox);

        return this;
    }

    public CheckoutPage switchToFrameCardNumber() {
        presenceOfElementLocated(driver, selectPaymentFrame);
        driver.switchTo().frame(driver.findElement(selectPaymentFrame));
        return this;
    }

    public CheckoutPage inputCardNumber(String text) {
        javascriptExecutorScroll(driver, cardNumberField);
        driver.findElement(cardNumberField).sendKeys(text);
        return this;
    }

    public CheckoutPage switchToFrameDateExpiry() {
        presenceOfElementLocated(driver, selectCardNumberFrame);
        driver.switchTo().frame(driver.findElement(selectCardNumberFrame));
        return this;
    }

    public CheckoutPage inputDateExiry(String text) {
        driver.findElement(expiryDateField).sendKeys(text);
        return this;
    }

    public CheckoutPage switchToFrameCVC() {
        presenceOfElementLocated(driver, selectCVCFrame);
        driver.switchTo().frame(driver.findElement(selectCVCFrame));
        return this;
    }

    public CheckoutPage inputCVC(String text) {
        driver.findElement(cvcField).sendKeys(text);
        return this;
    }

    public CheckoutPage selectSubscriptionCheckbox() {
        selectCheckbox(driver, subscriptionCheckbox);
        return this;
    }

    public CheckoutPage clickSelectHowDidYouHer() {
        driver.findElement(howDidYouHearAboutUsField).click();
        return this;
    }

    public CheckoutPage clickSelectFacebook() {
        presenceOfElementLocated(driver, selectFacebook);
        driver.findElement(selectFacebook).click();

        return this;
    }

    public CheckoutPage clickSelectLeaseOrPurchase() {
        driver.findElement(leaseOrPurchaseField).click();
        return this;
    }

    public CheckoutPage clickSelectLease() {
        presenceOfElementLocated(driver, selectLease);
        driver.findElement(selectLease).click();
        return this;
    }

    public CheckoutPage clickPayButtom() {
        presenceOfElementLocated(driver, payButton);
        driver.findElement(payButton).click();
        return this;
    }

    public CheckoutPage successfullMessage() {
        presenceOfElementLocated(driver, successfullMessage);
        return this;

    }

}


