package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class LogOutPopupTest extends base.AppiumBaseTest {

    @Test
    // Test Case #21 — check visibility of elements in the Log Out popup
    public void testLogOutPopupElements() throws InterruptedException {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Click "Allow" if permission prompt is shown
        pages.allowPermission.clickAllowIfVisible();

        // Steps:
        // Click on "Skip"
        pages.firstScreen.getSkipButton().click();

        // Click on "Login"
        pages.testPreLogin.getLoginButton().click();

        // Click on "Log In with Email/Phone"
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on "Login with Password"
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

        // Click on "Log Out"
        pages.testRightMenuListPage.getLogOutIcon().click();

        // Assertions: check logout popup elements
        pages.testLogOutPopupPage.getPopupText();
        pages.testLogOutPopupPage.getCancelButton();
        pages.testLogOutPopupPage.getConfirmLogoutButton();
    }
}
