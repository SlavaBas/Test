import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    final By selectVehicleButton = By.xpath("//nav//a[@href='/vehicle']");
    final By selectVehicleBunnerButton = By.xpath("//section[contains(@class, 'style_banner')]//a[@href='/vehicle']");
    final By howGoWorksButton = By.xpath("//nav//a[@href='/how-go-works']");
    final By aboutUsButton = By.xpath("//nav//a[@href='/about-us']");
    final By faqButton = By.xpath("//nav//a[@href='/faq']");

    public VehiclePage clickSelectVehicle() {
        driver.findElement(selectVehicleButton).click();
        return new VehiclePage(driver);
    }

    public VehiclePage clickSelectVehicleOnBunner() {
        driver.findElement(selectVehicleBunnerButton).click();
        return new VehiclePage(driver);
    }

    public HowGoWorksPage clickHowGoWorks() {
        driver.findElement(howGoWorksButton).click();
        return new HowGoWorksPage(driver);
    }

    public AboutUsPage clickAboutUs() {
        driver.findElement(aboutUsButton).click();
        return new AboutUsPage(driver);
    }

    public FAQPage clickFaq() {
        driver.findElement(faqButton).click();
        return new FAQPage(driver);
    }


}
