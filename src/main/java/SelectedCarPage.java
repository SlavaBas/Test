import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedCarPage extends Settings{


    public SelectedCarPage(WebDriver driver) {
        super(driver);
    }

    final By selectAgeRangeField = By.xpath("//h4[text()='Select age range']");
    final By selectAge = By.xpath("//h4[text()='Age: 40-54 years old']");
    final By preloader = By.xpath("//div[contains(@class,'style_loader')]//img[@data-nimg='intrinsic']");


    public SelectedCarPage checkPreloaderInvisible() {
        waitInvisibilityOfElementLocated(preloader);
        return this;
    }


    public SelectedCarPage clickSelectAgeRange() {
        click(selectAgeRangeField);
        return this;
    }

    public SelectedCarPage clickSelectAge() {
        waitPresenceOfElementLocated(selectAge);
        click(selectAge);
        return this;
    }

    public CheckoutPage clickApplyCar() {
        javascriptExecutor("document.getElementsByClassName('MuiButton-root')[0].click()");
        return new CheckoutPage(driver);
    }
}
