import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends WebDriverSettings{

    @Test
    public void Test(){

        mainPage.clickSelectVehicle();
        vehiclePage.inputZIPCode("19044")
                .clickFindCar();
        carByZIPPage.checkText();
        String text = driver.findElement(By.xpath("//h4[text()='Location']")).getText();
        Assert.assertEquals("Location", text);
        carByZIPPage.clickSelectCar();
        selectedCarPage.checkPreloaderInvisible()
                .clickSelectAgeRange()
                .clickSelectAge()
                .clickApplyCar();
        checkoutPage.checkText()
                .inputFirstName(faker.name().firstName())
                .inputLastName(faker.name().lastName())
                .inputEmail(faker.internet().emailAddress())
                .inputPhone(faker.phoneNumber().phoneNumber())
                .clickVerifyMeButton()
                .switchToFrame()
                .clickAcceptIdentityButton()
                .clickContinueButton()
                .switchToDefaultContent()
                .clickConfirmAddressButton()
                .inputGrossIncome("555555")
                .selectPrivacyPolicyCheckbox()
                .selectConsumerCheckbox()
                .selectFairCheckbox()
                .clickCheckMeButton()
                .inputInsetance()
                .confirmInsuranceButton()
                .nextStepButton()
                .selectInsuranceCheckbox()
                .nextStepButton()
                .switchToFrameCardNumber()
                .inputCardNumber("4242424242424242")
                .switchToDefaultContent()
                .switchToFrameDateExpiry()
                .inputDateExiry("1233")
                .switchToDefaultContent()
                .switchToFrameCVC()
                .inputCVC("333")
                .switchToDefaultContent()
                .selectSubscriptionCheckbox()
                .clickSelectHowDidYouHer()
                .clickSelectFacebook()
                .clickSelectLeaseOrPurchase()
                .clickSelectLease()
                .clickPayButtom()
                .successfullMessage();


       // /Users/jigado/Documents/Java/JavaSelenium/files/file.jpg
    }

}
