
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectedCarPage {
    WebDriver driver;

    public SelectedCarPage(WebDriver driver) {
        this.driver = driver;
    }

    final By selectAgeRangeField = By.xpath("//h4[text()='Select age range']");
    final By selectAge = By.xpath("//h4[text()='Age: 40-54 years old']");
    final By preloader = By.xpath("//div[contains(@class,'style_loader')]//img[@data-nimg='intrinsic']");


    public SelectedCarPage checkPreloaderInvisible() {
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(40)));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
        return this;
    }

    public SelectedCarPage selectAgeRange() {

        Select selectObject = new Select(driver.findElement(selectAgeRangeField));
        selectObject.selectByIndex(2);
        return this;
    }


    public SelectedCarPage clickSelectAgeRange() {
        driver.findElement(selectAgeRangeField).click();
        return this;
    }

    public SelectedCarPage clickSelectAge() {
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.presenceOfElementLocated(selectAge));
        driver.findElement(selectAge).click();
        return this;
    }

    public CheckoutPage clickApplyCar() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('MuiButton-root')[0].click()");
        return new CheckoutPage(driver);
    }
}
