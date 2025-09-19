// file: src/test/tests/e2e_tests/BuySubscriptionTrialTest.java
package test.tests.e2e;

import org.junit.Test;
import test.pages.BuySubscriptionTrialPage;
import test.test_setup.BasePages;

public class BuySubscriptionTrialTest extends base.AppiumBaseTest {

    @Test
    // Test Case #32
    public void testBuySubscriptionTrialPageUI() {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);


        // Click "Allow" if permission prompt is shown
        pages.allowPermission.clickAllowIfVisible();

        // Steps:


        // Click "Login"
        pages.testPreLogin.getLoginButton().click();

        // Click "Log In with Email/Phone"
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click "Login with Password"
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Enter email and password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click "Sign In"
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Open right menu
        pages.testDashboardPage.getLogoParent().click();

        // Click на Subscription
        pages.testRightMenuListPage.getSubscriptionIcon().click();

        //Click on Top up button
        pages.testSubscriptionTrialPage.getTopUpBalanceButton().click();


        // Validate BuySubscriptionTrialPage UI elements
        pages.testBuySubscriptionTrialPage.getBackButton();
        pages.testBuySubscriptionTrialPage.getSubscriptionTitle();
        pages.testBuySubscriptionTrialPage.getTeacherCategoryStandardButton();
        pages.testBuySubscriptionTrialPage.getPeriodSixMonthsButton();
        pages.testBuySubscriptionTrialPage.getLessonsThreePerWeekButton();
        pages.testBuySubscriptionTrialPage.getBillingTypeTitle();
        pages.testBuySubscriptionTrialPage.getInstalmentPaymentsValue();
        pages.testBuySubscriptionTrialPage.getPayInFullValue();
        pages.testBuySubscriptionTrialPage.getApplyButton();
        pages.testBuySubscriptionTrialPage.getImmediatelyRadio();

        //Scroll:
        pages.testBuySubscriptionTrialPage.scrollDown();


        pages.testBuySubscriptionTrialPage.getSummaryBlock();
        pages.testBuySubscriptionTrialPage.getPaymentTimelineBlock();
        pages.testBuySubscriptionTrialPage.getPaymentMethodTitle();
        pages.testBuySubscriptionTrialPage.getBankCardOption();
        pages.testBuySubscriptionTrialPage.getConfirmAndPayButton();
    }
}
