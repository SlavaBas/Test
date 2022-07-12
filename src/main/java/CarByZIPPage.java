import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarByZIPPage extends Settings{
    WebDriver driver;

    public CarByZIPPage(WebDriver driver) {
        this.driver = driver;
    }

    final By locationText = By.xpath("//h4[text()='Location']");
    final By selectedCar = By.xpath("//a//h4[@title='2022 Nissan  Altima']");

    public CarByZIPPage checkText(){
        waitPresenceOfElementLocated(driver, locationText);
        return this;
    }

    public SelectedCarPage clickSelectCar(){
        driver.findElement(selectedCar).click();
        return new SelectedCarPage(driver);

    }




}
