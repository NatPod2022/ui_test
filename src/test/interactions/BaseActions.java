package test.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class BaseActions {
    public AppiumDriver driver;

    // 🔧 Конструктор класса. Получает драйвер из теста и сохраняет его
    public BaseActions(AppiumDriver driver) {
        this.driver = driver;
    }

    //  Ожидание появления элемента
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

    // Клик по элементу с ожиданием
    public WebElement elementsClick(By by, String errorMessage, long timeoutInSeconds, boolean throwException) {
        WebElement element = waitForElementPresent(by, errorMessage, timeoutInSeconds, throwException);
        element.click();
        return element;
    }

    // Ввод текста в элемент с ожиданием
    public WebElement elementsSendKey(By by, String value, String errorMessage, long timeoutInSeconds, boolean throwException) {
        WebElement element = waitForElementPresent(by, errorMessage, timeoutInSeconds, throwException);
        element.sendKeys(value);
        return element;
    }

    // Скролл вниз к элементу.
    public void scrollToElement(By by) {
        boolean isDisplayed = false;
        int maxScrolls = 5;
        int alreadyScrolled = 0;

        while (!isDisplayed && alreadyScrolled < maxScrolls) {
            try {
                WebElement element = driver.findElement(by);
                if (element.isDisplayed()) {
                    isDisplayed = true;
                    break;
                }
            } catch (Exception e) {
                scrollDown(); // скроллим вниз, если не найден
                alreadyScrolled++;
            }
        }

        if (!isDisplayed) {
            throw new AssertionError("❌ Element not found after scrolling: " + by.toString());
        }
    }

    // Простой свайп вниз по экрану
    public void scrollDown() {
        int height = driver.manage().window().getSize().height;
        int width = driver.manage().window().getSize().width;

        int startY = (int) (height * 0.7); // снизу
        int endY = (int) (height * 0.3);   // вверх
        int startX = width / 2;           // по центру экрана

        new TouchAction(driver)
                .press(startX, startY)
                .waitAction(500) // задержка 500 мс
                .moveTo(startX, endY)
                .release()
                .perform();
    }
}
