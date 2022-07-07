import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
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
    final By uploadButton = By.xpath("//div[contains(@class, 'upload')]//button");
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





    public CheckoutPage checkText() {
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.presenceOfElementLocated(verifyIdentityText));
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('MuiButton-root')[0].click()");
        return this;
    }

    public CheckoutPage switchToFrame() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(iframePrivateStripeFrame));
        driver.switchTo().frame(driver.findElement(iframePrivateStripeFrame));
        wait.until(ExpectedConditions.presenceOfElementLocated(iframeLightboxApp));
        driver.switchTo().frame(driver.findElement(iframeLightboxApp));
        return this;
    }

    public CheckoutPage clickAcceptIdentityButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
        driver.findElement(submitButton).click();
        return this;
    }

    public CheckoutPage clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(continueButton));
        driver.findElement(continueButton).click();
        return this;
    }

    public CheckoutPage switchToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }

    public CheckoutPage clickConfirmAddressButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(confirmAddressButton));
        driver.findElement(confirmAddressButton).click();
        return this;
    }

    public CheckoutPage inputGrossIncome(String gross) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(grossIncomeField));
        driver.findElement(grossIncomeField).sendKeys(gross);
        return this;
    }

    public CheckoutPage selectPrivacyPolicyCheckbox() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(privacyPolicyCheckbox));
        while (!driver.findElement(privacyPolicyCheckbox).isSelected()) {
            driver.findElement(privacyPolicyCheckbox).click();
            if (!driver.findElement(privacyPolicyCheckbox).isSelected()) {
                driver.findElement(privacyPolicyCheckbox).click();
            }
        }
        return this;
    }

    public CheckoutPage selectConsumerCheckbox() {

        while (!driver.findElement(consumerCheckbox).isSelected()) {
            driver.findElement(consumerCheckbox).click();
            if (!driver.findElement(consumerCheckbox).isSelected()) {
                driver.findElement(consumerCheckbox).click();
            }
        }
        return this;
    }

    public CheckoutPage selectFairCheckbox() {

        while (!driver.findElement(fairCheckbox).isSelected()) {
            driver.findElement(fairCheckbox).click();
            if (!driver.findElement(fairCheckbox).isSelected()) {
                driver.findElement(fairCheckbox).click();
            }
        }
        return this;
    }
    public CheckoutPage fileUpload(String filepath){
        if(driver.findElement(uploadField).isDisplayed()) {
            driver.findElement(uploadField).sendKeys(filepath);
        }
        return this;
    }

    public CheckoutPage clickCheckMeButton() {
        driver.findElement(checkMeButton).click();
        return this;
    }
    public CheckoutPage inputInsetance(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(inputInsuranceField));
        driver.findElement(inputInsuranceField).sendKeys("345351120");
        return this;
    }

    public CheckoutPage confirmInsuranceButton(){
        driver.findElement(confirmInsuranceButton).click();
        return this;
    }
    public CheckoutPage nextStepButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(nextStepButton));
        driver.findElement(nextStepButton).click();
        return this;
    }

    public CheckoutPage selectInsuranceCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(insuranceCheckbox));
        while (!driver.findElement(insuranceCheckbox).isSelected()) {
            driver.findElement(insuranceCheckbox).click();
            if (!driver.findElement(insuranceCheckbox).isSelected()) {
                driver.findElement(insuranceCheckbox).click();
            }
        }
        return this;
    }

    public CheckoutPage switchToFrameCardNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectPaymentFrame));
        driver.switchTo().frame(driver.findElement(selectPaymentFrame));
        return this;
    }

    public CheckoutPage inputCardNumber(String text){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(cardNumberField));
        driver.findElement(cardNumberField).sendKeys(text);
        return this;
    }

    public CheckoutPage switchToFrameDateExpiry() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectCardNumberFrame));
        driver.switchTo().frame(driver.findElement(selectCardNumberFrame));
        return this;
    }
    public CheckoutPage inputDateExiry(String text){
        driver.findElement(expiryDateField).sendKeys(text);
        return this;
    }
    public CheckoutPage switchToFrameCVC() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectCVCFrame));
        driver.switchTo().frame(driver.findElement(selectCVCFrame));
        return this;
    }
    public CheckoutPage inputCVC(String text){
        driver.findElement(cvcField).sendKeys(text);
        return this;
    }
    public CheckoutPage selectSubscriptionCheckbox(){
        while (!driver.findElement(subscriptionCheckbox).isSelected()) {
            driver.findElement(subscriptionCheckbox).click();
            if (!driver.findElement(subscriptionCheckbox).isSelected()) {
                driver.findElement(subscriptionCheckbox).click();
            }
        }
        return this;
    }
    public CheckoutPage clickSelectHowDidYouHer() {
        driver.findElement(howDidYouHearAboutUsField).click();
        return this;
    }
    public CheckoutPage clickSelectFacebook() {
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectFacebook));
        driver.findElement(selectFacebook).click();

        return this;
    }
    public CheckoutPage clickSelectLeaseOrPurchase() {
        driver.findElement(leaseOrPurchaseField).click();
        return this;
    }
    public CheckoutPage clickSelectLease() {

        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectLease));
        driver.findElement(selectLease).click();
        return this;
    }
    public CheckoutPage clickPayButtom() {
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.presenceOfElementLocated(payButton));
        driver.findElement(payButton).click();
        return this;
    }
    public CheckoutPage successfullMessage(){
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(30)));
        wait.until(ExpectedConditions.presenceOfElementLocated(successfullMessage));
        return this;

    }

}


