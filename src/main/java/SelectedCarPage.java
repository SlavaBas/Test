import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedCarPage extends Settings{
    WebDriver driver;

    public SelectedCarPage(WebDriver driver) {
        this.driver = driver;
    }

    final By selectAgeRangeField = By.xpath("//h4[text()='Select age range']");
    final By selectAge = By.xpath("//h4[text()='Age: 40-54 years old']");
    final By preloader = By.xpath("//div[contains(@class,'style_loader')]//img[@data-nimg='intrinsic']");


    public SelectedCarPage checkPreloaderInvisible() {
        waitInvisibilityOfElementLocated(driver, preloader);
        return this;
    }


    public SelectedCarPage clickSelectAgeRange() {
        driver.findElement(selectAgeRangeField).click();
        return this;
    }

    public SelectedCarPage clickSelectAge() {
        waitPresenceOfElementLocated(driver, selectAge);
        driver.findElement(selectAge).click();
        return this;
    }

    public CheckoutPage clickApplyCar() {
        javascriptExecutor(driver, "document.getElementsByClassName('MuiButton-root')[0].click()");
        return new CheckoutPage(driver);
    }
}
