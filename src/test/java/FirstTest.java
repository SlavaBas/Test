import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends WebDriverSettings{

    @Test
    public void RentCarWithoutFlorida(){
        String phone = faker.phoneNumber().phoneNumber();
        mainPage.clickSelectVehicle();
        vehiclePage.inputZIPCode("19044")
                .clickFindCar();
        carByZIPPage.checkText();
        carByZIPPage.clickSelectCar();
        selectedCarPage.checkPreloaderInvisible()
                .clickSelectAgeRange()
                .clickSelectAge()
                .clickApplyCar();
        checkoutPage.checkText()
                .inputFirstName(faker.name().firstName())
                .inputLastName(faker.name().lastName())
                .inputEmail(faker.internet().emailAddress())
                .inputPhone(phone)
                .clickVerifyMeButton()
                .switchToFrameConfirmDocuments()
                .clickAcceptIdentityButton()
                .clickContinueButton()
                .switchToDefaultContent()
                .clickConfirmAddressButton()
                .inputGrossIncome("555555")
                .selectPrivacyPolicyCheckbox()
                .selectConsumerCheckbox()
                .selectFairCheckbox()
                .clickCheckMeButton()
                .inputInsetance("345351120")
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

    }
    @Test
    public void RentCarFlorida() {
        String phone = faker.phoneNumber().phoneNumber();
        mainPage.clickSelectVehicle();
        vehiclePage.inputZIPCode("33014")
                .clickFindCar();
        carByZIPPage.checkText();
        carByZIPPage.clickSelectCar();
        selectedCarPage.checkPreloaderInvisible()
                .clickSelectAgeRange()
                .clickSelectAge()
                .clickApplyCar();
        checkoutPage.checkText()
                .inputFirstName(faker.name().firstName())
                .inputLastName(faker.name().lastName())
                .inputEmail(faker.internet().emailAddress())
                .inputPhone(phone)
                .clickVerifyMeButton()
                .switchToFrameConfirmDocuments()
                .clickAcceptIdentityButton()
                .clickContinueButton()
                .switchToDefaultContent()
                .selectChangeAreaRadioButton()
                .inputAddress("Severity street")
                .inputCity("Alabama")
                .inputApartment("45")
                .selectState("Florida")
                .inputZIP("33014")
                .uploadDocuments("/Users/jigado/Documents/Java/JavaSeleniumUI/files/file.pdf")
                .goToSecondStep()
                .inputGrossIncome("555555")
                .selectPrivacyPolicyCheckbox()
                .selectConsumerCheckbox()
                .selectFairCheckbox()
                .clickCheckMeButton()
                .inputInsetance("345351120")
                .confirmInsuranceButton()
                .nextStepButton()
                .addPersonalInsurance()
                .inputInsuranceCarrier("64564564")
                .inputAgentPhoneNumber(phone)
                .inputPolicyNumber("45645645")
                .inputPolicyNumberExpirationDate("12122033")
                .uploadDocuments("/Users/jigado/Documents/Java/JavaSeleniumUI/files/file.pdf")
                .goToFourStep()
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
    }

}
