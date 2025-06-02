package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import test.interactions.BaseActions;

public class LogOutPopupPage extends BaseActions {

    public LogOutPopupPage(AppiumDriver driver) {
        super(driver);
    }

    public By popupText = By.xpath("//*[contains(@content-desc, 'Log out?')]");
    public By confirmLogoutButton = By.xpath("//android.widget.Button[@content-desc=\"Yes, log out\"]");
    public By cancelButton = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");






    public WebElement getPopupText() {
        return waitForElementPresent(popupText, "Cannot find logout confirmation text", 5, true);
    }

    public WebElement getCancelButton() {
        return waitForElementPresent(cancelButton, "Cannot find 'Cancel' button", 5, true);
    }

    public WebElement getConfirmLogoutButton() {
        return waitForElementPresent(confirmLogoutButton, "Cannot find 'Yes, log out' button", 5, true);
    }
}
