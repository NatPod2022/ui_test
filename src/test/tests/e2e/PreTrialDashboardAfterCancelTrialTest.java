package test.tests.e2e;

import base.AppiumBaseTest;
import org.junit.Test;
import test.pages.*;
import test.test_setup.BasePages;

public class PreTrialDashboardAfterCancelTrialTest extends AppiumBaseTest {

    @Test
    // Test Case #8
    public void testPreTrialDashboardAfterCancelTrialFlow() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert Email and Password
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Check:
        pages.dashboardPage.getLogoParent();
        pages.dashboardPage.getLabelNovakid();
        pages.dashboardPage.getTitle();
        pages.dashboardPage.getBookButton();
        pages.dashboardPage.getDashboardTab();
        pages.dashboardPage.getTextWeAreSorry();
        pages.dashboardPage.getStudentBlock();
        pages.dashboardPage.getSupportTab();
        pages.dashboardPage.getAchievementTab();
        pages.dashboardPage.getKaTab();
        pages.dashboardPage.getScheduleTab();
        pages.dashboardPage.getTitleHomework();

    }
}
