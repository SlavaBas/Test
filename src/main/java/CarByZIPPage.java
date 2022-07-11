import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CarByZIPPage extends Settings{
    WebDriver driver;

    public CarByZIPPage(WebDriver driver) {
        this.driver = driver;
    }

    final By locationText = By.xpath("//h4[text()='Location']");
    final By selectedCar = By.xpath("//a//h4[@title='2022 Nissan  Altima']");

    public CarByZIPPage checkText(){
        presenceOfElementLocated(driver, locationText);
        return this;
    }

    public SelectedCarPage clickSelectCar(){
        driver.findElement(selectedCar).click();
        return new SelectedCarPage(driver);

    }




}
