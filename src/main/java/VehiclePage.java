import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehiclePage extends Settings{


    public VehiclePage(WebDriver driver) {
        super(driver);
    }


    final By ZIPCodeField = By.xpath("//input[@placeholder='Enter ZIP сode']");
    final By findVehicleButton = By.xpath("//form//button[@type='submit']");


    public VehiclePage inputZIPCode(String zipcode){
        waitPresenceOfElementLocated(ZIPCodeField);
        sendKeys(ZIPCodeField, zipcode);
        return this;
    }

    public CarByZIPPage clickFindCar(){
        waitPresenceOfElementLocated(findVehicleButton);
        click(findVehicleButton);
        return new CarByZIPPage(driver);
    }

}