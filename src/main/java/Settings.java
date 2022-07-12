import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Settings {

    public void waitInvisibilityOfElementLocated(WebDriver driver, By element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(element));

    }

    public void waitPresenceOfElementLocated(WebDriver driver, By element) {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void javascriptExecutor(WebDriver driver, String string) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(string);
    }

    public void javascriptExecutorScrollIntoView(WebDriver driver, By element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(element));
    }

    public void uploadFiles(WebDriver driver, By element, String path) {
        WebElement chooseFile = driver.findElement(element);
        chooseFile.sendKeys(path);
    }

    public void selectCheckbox(WebDriver driver, By element) {
        while (!driver.findElement(element).isSelected()) {
            driver.findElement(element).click();
            if (!driver.findElement(element).isSelected()) {
                driver.findElement(element).click();
            }
        }
    }

}
