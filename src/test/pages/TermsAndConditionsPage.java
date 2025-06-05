package test.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class TermsAndConditionsPage extends BaseActions {

    public TermsAndConditionsPage(AppiumDriver driver) {
        super(driver);
    }

    public By urlBar = By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']");
    public By homePageButton = By.xpath("//android.widget.ImageButton[@content-desc='Open the home page']");

    public WebElement getUrlBar() {
        return waitForElementPresent(urlBar, "Cannot find URL bar", 5, true);
    }

    public WebElement getHomePageButton() {
        return waitForElementPresent(homePageButton, "Cannot find 'Open the home page' button", 5, true);
    }

    }

