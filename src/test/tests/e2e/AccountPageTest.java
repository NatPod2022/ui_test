package test.tests.e2e;

import org.junit.Test;
import base.AppiumBaseTest;
import test.test_setup.BasePages;

public class AccountPageTest extends AppiumBaseTest {

    @Test
    // Test Case #15
    public void testAccountPageElements() {
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow"
        pages.allowPermission.clickAllowIfVisible();

        // Steps:


        // Click on Login
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert email and password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Open right menu
        pages.testDashboardPage.getLogoParent().click();

        // Go to Account Page
        pages.testRightMenuListPage.getAccountIcon().click();

        // Check all elements on AccountPage
        pages.testAccountPage.getUserHeader();
        pages.testAccountPage.getAccountTitle();
        pages.testAccountPage.getPersonalInfo();
        pages.testAccountPage.getChangePassword();
        pages.testAccountPage.getBalanceHistory();
        pages.testAccountPage.getPrivacyPolicy();
        pages.testAccountPage.getTermsAndConditions();
    }
}
