import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarByZIPPage extends Settings{

    public CarByZIPPage(WebDriver driver) {
        super(driver);
    }

    final By locationText = By.xpath("//h4[text()='Location']");
    final By selectedCar = By.xpath("//a//h4[@title='2022 Nissan  Altima']");

    public CarByZIPPage checkText(){
        waitPresenceOfElementLocated(locationText);
        return this;
    }

    public SelectedCarPage clickSelectCar(){
        click(selectedCar);
        return new SelectedCarPage(driver);

    }




}
