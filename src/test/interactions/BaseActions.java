package test.interactions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {
    public AppiumDriver driver;

    public BaseActions(AppiumDriver driver) {
        this.driver = driver;
    }


    public WebElement waitForElementPresent(By by, String errorMessage, long timeoutInSeconds, boolean throwException) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            wait.withMessage(errorMessage + "\n");
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            if (throwException) {
                throw new AssertionError("❌ " + errorMessage, e);
            }
            return null;
        }
    }


    public WebElement elementsClick(By by, String error_message, long timeoutInSeconds, boolean throwException) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds,throwException);
        element.click();
        return element;
    }

    public WebElement elementsSendKey(By by, String value, String error_message, long timeoutInSeconds, boolean throwException) {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds,throwException);
        element.sendKeys(value);
        return element;
    }
}
