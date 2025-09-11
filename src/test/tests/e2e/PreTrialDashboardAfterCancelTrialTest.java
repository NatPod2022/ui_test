package test.tests.e2e;

import base.AppiumBaseTest;
import org.junit.Test;

import test.test_setup.BasePages;

public class PreTrialDashboardAfterCancelTrialTest extends AppiumBaseTest {

    @Test
    // Test Case #8
    public void testPreTrialDashboardAfterCancelTrialFlow() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        // Steps:


        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert Email and Password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");


        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Check:
        pages.testDashboardPage.getLogoParent();
        pages.testDashboardPage.getLabelNovakid();
        pages.testDashboardPage.getTitle();
        pages.testDashboardPage.getBookButton();
        pages.testDashboardPage.getDashboardTab();
        pages.testDashboardPage.getTextWeAreSorry();
        pages.testDashboardPage.getStudentBlock();
        pages.testDashboardPage.getSupportTab();
        pages.testDashboardPage.getAchievementTab();
        pages.testDashboardPage.getKaTab();
        pages.testDashboardPage.getScheduleTab();
        pages.testDashboardPage.getTitleHomework();

    }
}
