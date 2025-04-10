package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.test_setup.BasePages;

public class LoginStepByEmailTest extends base.AppiumBaseTest {

    @Test
    // Test Case #4
    public void testLogInStepByEmail() throws InterruptedException {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        //* Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();


        // Check LoginStepByEmailPage elements:
        pages.testLogInStepByEmail.getLogInTitleSecondStep();
        pages.testLogInStepByEmail.getEmailTab();
        pages.testLogInStepByEmail.getPhoneTab();
        pages.testLogInStepByEmail.getLogInInputField();
        pages.testLogInStepByEmail.getContinueButton();
        pages.testLogInStepByEmail.getLoginWithPasswordButton();
        pages.testLogInStepByEmail.getBackButtonSecond();


    }
}
