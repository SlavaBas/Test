import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Settings {
    WebDriver driver;

    public Settings(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By element) {
        return driver.findElement(element);
    }

    public WebDriver switchToFrame(By element) {
        return driver.switchTo().frame(find(element));
    }

    public WebDriver switchToDefault() {
        return driver.switchTo().defaultContent();
    }

    public void click(By element) {
        find(element).click();
    }

    public String getAttribute(By element, String text) {
        find(element).getAttribute(text);
        return text;
    }

    public void sendKeys(By element, String text) {
        find(element).sendKeys(text);
    }

    public void sendKeysKeyboardInput(By element, Keys key) {
        find(element).sendKeys(key);
    }

    public void sendKeysHotKeys(By element, Keys key, String text) {
        find(element).sendKeys(key + text);
    }

    public void waitInvisibilityOfElementLocated(By element) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    public void waitPresenceOfElementLocated(By element) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void waitElementToBeClickable(By element) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void javascriptExecutor(String string) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(string);
    }

    public void javascriptExecutorScrollIntoView(By element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", find(element));
    }

    public void uploadFiles(By element, String path) {
        WebElement chooseFile = find(element);
        chooseFile.sendKeys(path);
    }

    public void selectCheckbox(By element) {
        while (!find(element).isSelected()) {
            click(element);
            if (!find(element).isSelected()) {
                click(element);
            }
        }
    }

}
