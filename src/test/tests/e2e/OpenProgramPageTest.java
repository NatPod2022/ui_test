package test.tests.e2e;

import org.junit.Test;
import base.AppiumBaseTest;
import test.test_setup.BasePages;

public class OpenProgramPageTest extends AppiumBaseTest {

    @Test
    // Test Case #11
    public void testOpenProgramPageElements() {
        // Инициализация всех Page Object'ов
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

        // Click on Achievement tab
        pages.testDashboardPage.getAchievementTab().click();

        // Checks:
        pages.testOpenAchievementTabPage.getLevelCard().click();

        // Проверка элементов:
        pages.testOpenProgramPage.getProgramTitle();
        pages.testOpenProgramPage.getBackButton();
        pages.testOpenProgramPage.getLevel0();
        pages.testOpenProgramPage.getLevel1();
        pages.testOpenProgramPage.getLevel2();
        // Скролим вниз
        pages.testOpenProgramPage.scrollDown();
        pages.testOpenProgramPage.getLevel3();
        pages.testOpenProgramPage.getLevel4();
        pages.testOpenProgramPage.getLevel5();
        pages.testOpenProgramPage.getLevel6();

    }
}
