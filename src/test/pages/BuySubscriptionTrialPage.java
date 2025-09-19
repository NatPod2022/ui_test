package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class BuySubscriptionTrialPage extends BaseActions {

    public BuySubscriptionTrialPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By subscriptionTitle = By.xpath("//android.view.View[@content-desc='Subscription']");
    public By teacherCategoryStandardButton = By.xpath("//android.widget.Button[contains(@content-desc,'Teacher category')]");
    public By periodSixMonthsButton = By.xpath("//android.widget.Button[contains(@content-desc,'Subscription period')]");
    public By lessonsThreePerWeekButton = By.xpath("//android.widget.Button[contains(@content-desc,'Lessons')]");
    public By billingTypeTitle = By.xpath("//android.view.View[@content-desc='Billing type']");
    public By instalmentPaymentsValue = By.xpath("//android.view.View[contains(@content-desc,'Instalment payments')]");
    public By payInFullValue = By.xpath("//android.view.View[contains(@content-desc,'Pay in full')]");
    public By applyButton = By.xpath("//android.widget.Button[@content-desc='Apply']");
    public By immediatelyRadio = By.xpath("//android.widget.RadioButton[@content-desc='Immediately']");
    public By summaryBlock = By.xpath("//android.view.View[contains(@content-desc,'Summary')]");
    public By paymentTimelineBlock = By.xpath("//android.view.View[contains(@content-desc,'Payment timeline')]");
    public By paymentMethodTitle = By.xpath("//android.view.View[@content-desc='Payment method']");
    public By bankCardOption = By.xpath("//android.view.View[@content-desc='Bank card']");
    public By confirmAndPayButton = By.xpath("//android.widget.Button[@content-desc='Confirm and pay']");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getSubscriptionTitle() {
        return waitForElementPresent(subscriptionTitle, "Cannot find 'Subscription' title", 5, true);
    }

    public WebElement getTeacherCategoryStandardButton() {
        return waitForElementPresent(teacherCategoryStandardButton, "Cannot find 'Teacher category Standard' button", 5, true);
    }

    public WebElement getPeriodSixMonthsButton() {
        return waitForElementPresent(periodSixMonthsButton, "Cannot find 'Subscription period 6 months' button", 5, true);
    }

    public WebElement getLessonsThreePerWeekButton() {
        return waitForElementPresent(lessonsThreePerWeekButton, "Cannot find 'Lessons 3 per week' button", 5, true);
    }

    public WebElement getBillingTypeTitle() {
        return waitForElementPresent(billingTypeTitle, "Cannot find 'Billing type' title", 5, true);
    }

    public WebElement getInstalmentPaymentsValue() {
        return waitForElementPresent(instalmentPaymentsValue, "Cannot find 'Instalment payments' value", 5, true);
    }

    public WebElement getPayInFullValue() {
        return waitForElementPresent(payInFullValue, "Cannot find 'Pay in full' value", 5, true);
    }

    public WebElement getApplyButton() {
        return waitForElementPresent(applyButton, "Cannot find 'Apply' button", 5, true);
    }

    public WebElement getImmediatelyRadio() {
        return waitForElementPresent(immediatelyRadio, "Cannot find 'Immediately' radio button", 5, true);
    }

    public WebElement getSummaryBlock() {
        return waitForElementPresent(summaryBlock, "Cannot find Summary block", 5, true);
    }

    public WebElement getPaymentTimelineBlock() {
        return waitForElementPresent(paymentTimelineBlock, "Cannot find Payment timeline block", 5, true);
    }

    public WebElement getPaymentMethodTitle() {
        return waitForElementPresent(paymentMethodTitle, "Cannot find 'Payment method' title", 5, true);
    }

    public WebElement getBankCardOption() {
        return waitForElementPresent(bankCardOption, "Cannot find 'Bank card' option", 5, true);
    }

    public WebElement getConfirmAndPayButton() {
        return waitForElementPresent(confirmAndPayButton, "Cannot find 'Confirm and pay' button", 5, true);
    }
}
