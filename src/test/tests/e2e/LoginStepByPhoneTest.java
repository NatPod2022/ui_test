package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.LoginStepByPhonePage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.test_setup.BasePages;

public class LoginStepByPhoneTest extends base.AppiumBaseTest {

    @Test
    // Test Case #5
    public void testLogInStepByPhone() throws InterruptedException {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        //* Steps:


        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on phoneTab
        pages.testLogInStepByEmail.getPhoneTab().click();


        // Check LoginStepByEmailPage elements:
        pages.testLogInStepByPhone.getphoneIndex();
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton();


    }
}
