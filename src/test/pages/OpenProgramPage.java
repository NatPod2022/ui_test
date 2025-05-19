package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;

public class OpenProgramPage extends BaseActions {

    public OpenProgramPage(AppiumDriver driver) {
        super(driver);
    }

    public By programTitle = By.xpath("//android.view.View[@content-desc='Program']");
    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");

    public By level0 = By.xpath("//android.view.View[@content-desc='Level 0: Pre-K']");
    public By level1 = By.xpath("//android.view.View[@content-desc='Level 1: Juniors']");
    public By level2 = By.xpath("//android.view.View[@content-desc='Level 2: Starters']");
    public By level3 = By.xpath("//android.view.View[@content-desc='Level 3: Movers']");
    public By level4 = By.xpath("//android.view.View[@content-desc='Level 4: Flyers']");
    public By level5 = By.xpath("//android.view.View[@content-desc='Level 5: Time2Talk']");
    public By level6 = By.xpath("//android.view.View[@content-desc='Level 6: Virtual Explorer']");

    public By trialLessonCard = By.xpath("//android.view.View[@content-desc=\"Unit 0. Trial Level 2 Lesson: Lv2.Un0.Ls1 - Magic Academy Level 2 : Trial lesson - Welcome to Novakid!\"]");

    public WebElement getProgramTitle() {
        return waitForElementPresent(programTitle, "Cannot find Program title", 10, true);
    }

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getLevel0() {
        return waitForElementPresent(level0, "Cannot find Level 0: Pre-K", 5, true);
    }

    public WebElement getLevel1() {
        return waitForElementPresent(level1, "Cannot find Level 1: Juniors", 5, true);
    }

    public WebElement getLevel2() {
        return waitForElementPresent(level2, "Cannot find Level 2: Starters", 5, true);
    }

    public WebElement getLevel3() {
        return waitForElementPresent(level3, "Cannot find Level 3: Movers", 5, true);
    }

    public WebElement getLevel4() {
        return waitForElementPresent(level4, "Cannot find Level 4: Flyers", 5, true);
    }

    public WebElement getLevel5() {
        return waitForElementPresent(level5, "Cannot find Level 5: Time2Talk", 5, true);
    }

    public WebElement getLevel6() {
        return waitForElementPresent(level6, "Cannot find Level 6: Virtual Explorer", 5, true);
    }

    public WebElement getTrialLessonCard() {
        return waitForElementPresent(trialLessonCard, "Cannot find Trial lesson card", 5, true);
    }
}
