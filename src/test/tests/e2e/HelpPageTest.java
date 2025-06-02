package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class HelpPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #20 — check visibility of elements on Help screen
    public void testHelpPageElements() throws InterruptedException {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Click "Allow" if permission prompt is shown
        pages.allowPermission.clickAllowIfVisible();

        // Steps:
        // Click "Skip"
        pages.firstScreen.getSkipButton().click();

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

        // Click on "Help"
        pages.testRightMenuListPage.getHelpIcon().click();

        // Assertions: verify all elements on Help screen
        pages.testHelpPage.getBackButton();
        pages.testHelpPage.getHelpTitle();
        pages.testHelpPage.getCollectionsCount();
        pages.testHelpPage.getOrganizeTrialText();
        pages.testHelpPage.getBookingText();
        pages.testHelpPage.getBookingArticles();
        pages.testHelpPage.getManageScheduleText();
        pages.testHelpPage.getManageScheduleDescription();
        pages.testHelpPage.getManageScheduleArticles();
        pages.testHelpPage.getSubscriptionText();
        pages.testHelpPage.getSubscriptionArticles();
        pages.testHelpPage.getTechSupportText();
        pages.testHelpPage.getTechSupportArticles();
        pages.testHelpPage.getTeachersText();
        pages.testHelpPage.getTeachersDescription();
        pages.testHelpPage.getTeachersArticles();
        pages.testHelpPage.getAccountText();
        pages.testHelpPage.getAccountDescription();
        pages.testHelpPage.getAccountArticles();
    }
}
