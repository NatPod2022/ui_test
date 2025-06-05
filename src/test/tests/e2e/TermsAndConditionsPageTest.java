package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class TermsAndConditionsPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #26 — check visibility of elements on Terms and Conditions screen
    public void testTermsAndConditionsPageElements() throws InterruptedException {
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

        // Go to Account Page
        pages.testRightMenuListPage.getAccountIcon().click();

        // Go to Terms and Conditions page
        pages.testAccountPage.getTermsAndConditions().click();

        // Check all elements on Terms and Conditions page
        pages.testTermsAndConditionsPage.getUrlBar();
        pages.testTermsAndConditionsPage.getHomePageButton();
    }
}
