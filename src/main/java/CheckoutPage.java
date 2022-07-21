import org.openqa.selenium.*;

public class CheckoutPage extends Settings {

    public CheckoutPage(WebDriver driver) {
        super(driver);
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
    final By removeUploadedFileButton = By.xpath("//a[contains(@class,'style_remove_button')]");
    final By goToSecondStepButton = By.xpath("//div[contains(@class,'form_submit_box')]//button");
    final By addPersonalInsurance = By.xpath("//h4[text()='add Personal insurance']");
    final By insuranceCarrierField = By.id("textfield-insuranceCareer");
    final By agentPhoneNumberField = By.xpath("//input[@class='input_default' and @inputmode='numeric'] ");
    final By policyNumberField = By.name("insurancePolicyNumber");
    final By policyNumberExpirationDateField = By.name("insuranceExpirationDate");
    final By goToFourStepButton = By.xpath("//button[contains(@class, 'Button-root') and @type='submit']");




    public CheckoutPage addPersonalInsurance() {
        waitPresenceOfElementLocated(addPersonalInsurance);
        javascriptExecutorScrollIntoView(addPersonalInsurance);
        click(addPersonalInsurance);
        return this;
    }

    public CheckoutPage inputInsuranceCarrier(String text) {
        sendKeys(insuranceCarrierField, text);
        return this;
    }

    public CheckoutPage inputAgentPhoneNumber(String text) {
        click(agentPhoneNumberField);
        sendKeys(agentPhoneNumberField, text);

        return this;
    }

    public CheckoutPage inputPolicyNumberExpirationDate(String text) {
        sendKeys(policyNumberExpirationDateField, text);
        return this;
    }

    public CheckoutPage inputPolicyNumber(String text) {
        sendKeys(policyNumberField, text);
        return this;
    }

    public CheckoutPage goToFourStep() {
        javascriptExecutorScrollIntoView(goToFourStepButton);
        click(goToFourStepButton);
        return this;
    }


    public CheckoutPage goToSecondStep() {
        click(goToSecondStepButton);
        return this;
    }

    public CheckoutPage uploadDocuments(String path) {
        javascriptExecutorScrollIntoView(uploadResidencyDocuments);
        uploadFiles(uploadResidencyDocuments, path);
        waitPresenceOfElementLocated(removeUploadedFileButton);
        return this;
    }

    public CheckoutPage inputZIP(String apartment) {
        sendKeys(inputZIPField, apartment);
        return this;
    }

    public CheckoutPage inputApartment(String apartment) {
        sendKeys(inputApartmentField, apartment);
        return this;
    }

    public CheckoutPage inputCity(String city) {
        sendKeys(inputCityField, city);
        return this;
    }

    public CheckoutPage inputAddress(String address) {
        waitPresenceOfElementLocated(inputAddressField);
        sendKeys(inputAddressField, address);
        return this;
    }

    public CheckoutPage selectChangeAreaRadioButton() {
        click(changeAreaRadioButton);
        return this;
    }

    public CheckoutPage selectState(String state) {
        waitPresenceOfElementLocated(inputStateField);
        sendKeys(inputStateField, state);
        sendKeysKeyboardInput(inputStateField, Keys.ARROW_DOWN);
        sendKeysKeyboardInput(inputStateField, Keys.ENTER);
        return this;
    }


    public CheckoutPage checkText() {
        waitPresenceOfElementLocated(verifyIdentityText);
        return this;
    }

    public CheckoutPage inputFirstName(String firstname) {
        sendKeys(firstNameField, firstname);
        return this;
    }

    public CheckoutPage inputLastName(String lastname) {
        sendKeys(lastNameField, lastname);
        return this;
    }

    public CheckoutPage inputEmail(String email) {
        sendKeys(emailField, email);
        return this;
    }

    public CheckoutPage inputPhone(String phone) {
        click(phoneField);
        sendKeys(phoneField, phone);
        return this;
    }

    public CheckoutPage clickVerifyMeButton() {
        javascriptExecutor("document.getElementsByClassName('MuiButton-root')[0].click()");
        return this;
    }

    public CheckoutPage switchToFrameConfirmDocuments() {
        waitPresenceOfElementLocated(iframePrivateStripeFrame);
        switchToFrame(iframePrivateStripeFrame);
        waitPresenceOfElementLocated(iframeLightboxApp);
        switchToFrame(iframeLightboxApp);
        return this;
    }

    public CheckoutPage clickAcceptIdentityButton() {
        waitPresenceOfElementLocated(submitButton);
        click(submitButton);
        return this;
    }

    public CheckoutPage clickContinueButton() {
        waitPresenceOfElementLocated(continueButton);
        click(continueButton);
        return this;
    }

    public CheckoutPage switchToDefaultContent() {
        switchToDefault();
        return this;
    }

    public CheckoutPage clickConfirmAddressButton() {
        waitPresenceOfElementLocated(confirmAddressButton);
        click(confirmAddressButton);
        return this;
    }

    public CheckoutPage inputGrossIncome(String gross) {
        waitPresenceOfElementLocated(grossIncomeField);
        sendKeys(grossIncomeField, gross);
        return this;
    }

    public CheckoutPage selectPrivacyPolicyCheckbox() {
        javascriptExecutorScrollIntoView(privacyPolicyCheckbox);
        selectCheckbox(privacyPolicyCheckbox);
        return this;
    }

    public CheckoutPage selectConsumerCheckbox() {
        selectCheckbox(consumerCheckbox);
        return this;
    }

    public CheckoutPage selectFairCheckbox() {
        selectCheckbox(fairCheckbox);
        return this;
    }


    public CheckoutPage clickCheckMeButton() {
        waitElementToBeClickable(checkMeButton);
        click(checkMeButton);
        return this;
    }

    public CheckoutPage inputInsetance(String text) {
        waitPresenceOfElementLocated(inputInsuranceField);
        sendKeys(inputInsuranceField, text);
        return this;
    }

    public CheckoutPage confirmInsuranceButton() {
        click(confirmInsuranceButton);
        return this;
    }

    public CheckoutPage nextStepButton() {
        waitPresenceOfElementLocated(nextStepButton);
        click(nextStepButton);
        return this;
    }

    public CheckoutPage selectInsuranceCheckbox() {
        waitPresenceOfElementLocated(insuranceCheckbox);
        selectCheckbox(insuranceCheckbox);

        return this;
    }

    public CheckoutPage switchToFrameCardNumber() {
        waitPresenceOfElementLocated(selectPaymentFrame);
        switchToFrame(selectPaymentFrame);
        return this;
    }

    public CheckoutPage inputCardNumber(String text) {
        javascriptExecutorScrollIntoView(cardNumberField);
        sendKeys(cardNumberField, text);
        return this;
    }

    public CheckoutPage switchToFrameDateExpiry() {
        waitPresenceOfElementLocated(selectCardNumberFrame);
        switchToFrame(selectCardNumberFrame);
        return this;
    }

    public CheckoutPage inputDateExiry(String text) {
        sendKeys(expiryDateField, text);
        return this;
    }

    public CheckoutPage switchToFrameCVC() {
        waitPresenceOfElementLocated(selectCVCFrame);
        switchToFrame(selectCVCFrame);
        return this;
    }

    public CheckoutPage inputCVC(String text) {
        sendKeys(cvcField, text);
        return this;
    }

    public CheckoutPage selectSubscriptionCheckbox() {
        selectCheckbox(subscriptionCheckbox);
        return this;
    }

    public CheckoutPage clickSelectHowDidYouHer() {
        click(howDidYouHearAboutUsField);
        return this;
    }

    public CheckoutPage clickSelectFacebook() {
        waitPresenceOfElementLocated(selectFacebook);
        click(selectFacebook);
        return this;
    }

    public CheckoutPage clickSelectLeaseOrPurchase() {
        click(leaseOrPurchaseField);
        return this;
    }

    public CheckoutPage clickSelectLease() {
        waitPresenceOfElementLocated(selectLease);
        click(selectLease);
        return this;
    }

    public CheckoutPage clickPayButtom() {
        waitPresenceOfElementLocated(payButton);
        click(payButton);
        return this;
    }

    public CheckoutPage successfullMessage() {
        waitPresenceOfElementLocated(successfullMessage);
        return this;

    }

}


