package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class SpeakingPracticePage extends BaseActions {

    public SpeakingPracticePage(AppiumDriver driver) {
        super(driver);
    }

    public By titleText = By.xpath("//android.widget.TextView[@text='Get your child fluent in English 2X faster']");
    public By subtitleText = By.xpath("//android.widget.TextView[@text='Add international speaking groups to 1-to-1 lessons for $36/month.']");
    public By ageGroup4to6 = By.xpath("//android.widget.TextView[@text='4–6 y.o.']");
    public By ageGroup7to9 = By.xpath("//android.widget.TextView[@text='7–9 y.o.']");
    public By ageGroup10to13 = By.xpath("//android.widget.TextView[@text='10–13 y.o.']");
    public By joinNowButton = By.xpath("//android.widget.Button[@text='Join Now']");
    public By videoPreviewImage = By.xpath("//android.widget.Image[@text='Video preview']");
    public By globeImage = By.xpath("//android.widget.Image[@text='globe']");

    public WebElement getTitleText() {
        return waitForElementPresent(titleText, "Cannot find title text", 5, true);
    }

    public WebElement getSubtitleText() {
        return waitForElementPresent(subtitleText, "Cannot find subtitle text", 5, true);
    }

    public WebElement getAgeGroup4to6() {
        return waitForElementPresent(ageGroup4to6, "Cannot find age group 4–6", 5, true);
    }

    public WebElement getAgeGroup7to9() {
        return waitForElementPresent(ageGroup7to9, "Cannot find age group 7–9", 5, true);
    }

    public WebElement getAgeGroup10to13() {
        return waitForElementPresent(ageGroup10to13, "Cannot find age group 10–13", 5, true);
    }

    public WebElement getJoinNowButton() {
        return waitForElementPresent(joinNowButton, "Cannot find 'Join Now' button", 5, true);
    }

    public WebElement getVideoPreviewImage() {
        return waitForElementPresent(videoPreviewImage, "Cannot find video preview image", 5, true);
    }

    public WebElement getGlobeImage() {
        return waitForElementPresent(globeImage, "Cannot find globe image", 5, true);
    }
}
