package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class OldBonusPage extends BaseActions {

    public OldBonusPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By titleInvite = By.xpath("//android.widget.TextView[@text='Invite your friends to Novakid!']");
    public By step1 = By.xpath("//android.widget.TextView[@text='1']");
    public By shareText = By.xpath("//android.widget.TextView[@text='Share your referral link with a friend.']");
    public By inviteLinkText = By.xpath("//android.view.View[@text='Invite a friend via the link']");
    public By referralInput = By.xpath("//android.widget.EditText[@text='https://www.novakidschool.com/r/6bbes?utm_ref_source=bonus_page']");
    public By shareButton1 = By.xpath("//android.widget.Button[@resource-id=':r0:']");
    public By shareButton2 = By.xpath("//android.widget.Button[@resource-id=':r1:']");
    public By step2 = By.xpath("//android.widget.TextView[@text='2']");
    public By friendBonusText = By.xpath("//android.widget.TextView[@text='Your friend registers via the link and gets a bonus: $30 added to their account after completing a trial lesson.']");
    public By step3 = By.xpath("//android.widget.TextView[@text='3']");
    public By yourBonusText = By.xpath("//android.widget.TextView[@text='You get $30 after your friend buys a subscription and then 5% of each of their purchase!']");
    public By inviteTitle = By.xpath("//android.widget.TextView[@text='🦸INVITE FRIENDS TO NOVAKID AND GET BENEFITS!']");
    public By saveBonusPart1 = By.xpath("//android.widget.TextView[@text='⭐️ Use bonuses to save ']");
    public By saveBonusPart2 = By.xpath("//android.widget.TextView[@text='up to 25%']");
    public By saveBonusPart3 = By.xpath("//android.widget.TextView[@text=' when buying a subscription']");
    public By convertBonusText = By.xpath("//android.widget.TextView[@text='⭐️ Convert bonuses into lessons (once a month, up to 2 lessons)']");
    public By noTransactionsText = By.xpath("//android.widget.TextView[@text='You don’t have any bonus transactions yet.']");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getTitleInvite() {
        return waitForElementPresent(titleInvite, "Cannot find title 'Invite your friends'", 5, true);
    }

    public WebElement getStep1() {
        return waitForElementPresent(step1, "Cannot find step 1", 5, true);
    }

    public WebElement getShareText() {
        return waitForElementPresent(shareText, "Cannot find share text", 5, true);
    }

    public WebElement getInviteLinkText() {
        return waitForElementPresent(inviteLinkText, "Cannot find invite link label", 5, true);
    }

    public WebElement getReferralInput() {
        return waitForElementPresent(referralInput, "Cannot find referral input", 5, true);
    }

    public WebElement getShareButton1() {
        return waitForElementPresent(shareButton1, "Cannot find first share button", 5, true);
    }

    public WebElement getShareButton2() {
        return waitForElementPresent(shareButton2, "Cannot find second share button", 5, true);
    }

    public WebElement getStep2() {
        return waitForElementPresent(step2, "Cannot find step 2", 5, true);
    }

    public WebElement getFriendBonusText() {
        return waitForElementPresent(friendBonusText, "Cannot find friend bonus text", 5, true);
    }

    public WebElement getStep3() {
        return waitForElementPresent(step3, "Cannot find step 3", 5, true);
    }

    public WebElement getYourBonusText() {
        return waitForElementPresent(yourBonusText, "Cannot find your bonus text", 5, true);
    }

    public WebElement getInviteTitle() {
        return waitForElementPresent(inviteTitle, "Cannot find invite benefits title", 5, true);
    }

    public WebElement getSaveBonusPart1() {
        return waitForElementPresent(saveBonusPart1, "Cannot find 'Use bonuses to save'", 5, true);
    }

    public WebElement getSaveBonusPart2() {
        return waitForElementPresent(saveBonusPart2, "Cannot find 'up to 25%'", 5, true);
    }

    public WebElement getSaveBonusPart3() {
        return waitForElementPresent(saveBonusPart3, "Cannot find 'when buying a subscription'", 5, true);
    }

    public WebElement getConvertBonusText() {
        return waitForElementPresent(convertBonusText, "Cannot find convert bonus text", 5, true);
    }

    public WebElement getNoTransactionsText() {
        return waitForElementPresent(noTransactionsText, "Cannot find 'no bonus transactions' text", 5, true);
    }
}
