package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class BalanceHistoryTest extends base.AppiumBaseTest {

    @Test
    // Test Case #24 — check visibility of elements on Balance History screen
    public void testBalanceHistoryPageElements() throws InterruptedException {
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

        // Go to Account Page
        pages.testRightMenuListPage.getAccountIcon().click();

        // Go to Balance History page
        pages.testAccountPage.getBalanceHistory().click();

        // Check all elements on Balance History page
        pages.testBalanceHistoryPage.getBackButton();
        pages.testBalanceHistoryPage.getBalanceHistoryTitle();
        pages.testBalanceHistoryPage.getTrialLessonEntry();
    }
}
