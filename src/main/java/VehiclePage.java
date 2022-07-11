import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehiclePage extends Settings{
    WebDriver driver;

    public VehiclePage(WebDriver driver) {
        this.driver = driver;
    }


    final By ZIPCodeField = By.xpath("//input[@placeholder='Enter ZIP сode']");
    final By findVehicleButton = By.xpath("//form//button[@type='submit']");


    public VehiclePage inputZIPCode(String zipcode){
        presenceOfElementLocated(driver, ZIPCodeField);
        driver.findElement(ZIPCodeField).sendKeys(zipcode);
        return this;
    }

    public CarByZIPPage clickFindCar(){
        presenceOfElementLocated(driver, findVehicleButton);
        driver.findElement(findVehicleButton).click();
        return new CarByZIPPage(driver);
    }

}