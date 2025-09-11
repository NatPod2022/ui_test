package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class PersonalInformationTest extends base.AppiumBaseTest {

    @Test
    // Test Case #22 — check visibility of elements on Personal Information screen
    public void testPersonalInformationPageElements() throws InterruptedException {
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

        // Go to Personal Information
        pages.testAccountPage.getPersonalInfo().click();

        // Assertions: verify all elements on Personal Information screen
        pages.testPersonalInformationPage.getBackButton();
        pages.testPersonalInformationPage.getPersonalInfoTitle();
        pages.testPersonalInformationPage.getPhoneNumber();
        pages.testPersonalInformationPage.getEmail();
        pages.testPersonalInformationPage.getTimeZone();
        pages.testPersonalInformationPage.getSubstituteTeachersImage();
        pages.testPersonalInformationPage.getDontSubstituteTeachersImage();
        pages.testPersonalInformationPage.getDeleteAccountButton();
    }
}
