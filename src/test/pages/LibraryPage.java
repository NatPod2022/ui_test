package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class LibraryPage extends BaseActions {

    public LibraryPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By beginnersGroupsButton = By.xpath("//android.widget.Button[contains(@text, 'Beginners')]");


    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getBeginnersGroupsButton() {
        return waitForElementPresent(beginnersGroupsButton, "Cannot find 'Groups - Beginners: Activity Books' button", 5, true);
    }
}
