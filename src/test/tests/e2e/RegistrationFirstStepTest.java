package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.pages.RegistrationFirstStepPage;
import test.test_setup.BasePages;

public class RegistrationFirstStepTest extends base.AppiumBaseTest {

    @Test
    // Test Case #30
    public void testRegistrationFirstStep() {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Click "Allow" if permission popup appears
        pages.allowPermission.clickAllowIfVisible();

        //*Steps:

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        //Click on Register:
        pages.testLogInPageFirstStep.getRegisterButton().click();

        // Check RegistrationFirstStepPage elements
        pages.testRegistrationFirstStep.getBackButton();
        pages.testRegistrationFirstStep.getCreateYourAccountText();
        pages.testRegistrationFirstStep.getSignUpWithGoogleButton();
        pages.testRegistrationFirstStep.getNameInputField();
        pages.testRegistrationFirstStep.getEmailInputField();
        pages.testRegistrationFirstStep.getCountryCodeImage();
        pages.testRegistrationFirstStep.getPhoneInputField();
        pages.testRegistrationFirstStep.getCreateAccountButton();
        pages.testRegistrationFirstStep.getAgreeToText();
        pages.testRegistrationFirstStep.getPrivacyPolicyButton();
        pages.testRegistrationFirstStep.getCommaText();
        pages.testRegistrationFirstStep.getTermsAndConditionsButton();
    }
}
