package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class RightMenuListPage extends BaseActions {

    public RightMenuListPage(AppiumDriver driver) {
        super(driver);
    }

    public By ppSection = By.xpath("//android.view.View[@content-desc='PP']");
    public By userName = By.xpath("//android.view.View[@content-desc='Pre_trial_after_cancel Podor[TEST][AUTO]']");
    public By mishaIcon = By.xpath("//android.widget.ImageView[@content-desc='Misha']");
    public By newStudentIcon = By.xpath("//android.widget.ImageView[@content-desc='New student']");
    public By accountIcon = By.xpath("//android.widget.ImageView[@content-desc='Account']");
    public By subscriptionIcon = By.xpath("//android.widget.ImageView[@content-desc='Subscription']");
    public By bonusesIcon = By.xpath("//android.widget.ImageView[@content-desc='Bonuses']");
    public By librarySection = By.xpath("//android.view.View[@content-desc='Library']");
    public By speakingPracticeIcon = By.xpath("//android.widget.ImageView[@content-desc='Speaking practice']");
    public By helpIcon = By.xpath("//android.widget.ImageView[@content-desc='Help']");
    public By logOutIcon = By.xpath("//android.widget.ImageView[@content-desc='Log out']");
    public By goButton = By.xpath("//android.widget.Button[@content-desc='Go!']");

    public WebElement getPpSection() {
        return waitForElementPresent(ppSection, "Cannot find PP section", 5, true);
    }

    public WebElement getUserName() {
        return waitForElementPresent(userName, "Cannot find user name", 5, true);
    }

    public WebElement getMishaIcon() {
        return waitForElementPresent(mishaIcon, "Cannot find Misha icon", 5, true);
    }

    public WebElement getNewStudentIcon() {
        return waitForElementPresent(newStudentIcon, "Cannot find New student icon", 5, true);
    }

    public WebElement getAccountIcon() {
        return waitForElementPresent(accountIcon, "Cannot find Account icon", 5, true);
    }

    public WebElement getSubscriptionIcon() {
        return waitForElementPresent(subscriptionIcon, "Cannot find Subscription icon", 5, true);
    }

    public WebElement getBonusesIcon() {
        return waitForElementPresent(bonusesIcon, "Cannot find Bonuses icon", 5, true);
    }

    public WebElement getLibrarySection() {
        return waitForElementPresent(librarySection, "Cannot find Library section", 5, true);
    }

    public WebElement getSpeakingPracticeIcon() {
        return waitForElementPresent(speakingPracticeIcon, "Cannot find Speaking practice icon", 5, true);
    }

    public WebElement getHelpIcon() {
        return waitForElementPresent(helpIcon, "Cannot find Help icon", 5, true);
    }

    public WebElement getLogOutIcon() {
        return waitForElementPresent(logOutIcon, "Cannot find Log out icon", 5, true);
    }

    public WebElement getGoButton() {
        return waitForElementPresent(goButton, "Cannot find Go button", 5, true);
    }
}
