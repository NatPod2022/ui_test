package test.tests.e2e;

import org.junit.Test;
import base.AppiumBaseTest;
import test.test_setup.BasePages;

public class OpenIntercomTest extends AppiumBaseTest {

    @Test
    // Test Case #12
    public void testOpenIntercomElements() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

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
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Клик по иконке Intercom
        pages.testDashboardPage.getSupportTab().click();

        // Проверка элементов на экране Intercom
        pages.testOpenIntercomPage.getProfileImage();
        pages.testOpenIntercomPage.getGreetingText();
        pages.testOpenIntercomPage.getHelpTitle();
        pages.testOpenIntercomPage.getHelpTab();
        pages.testOpenIntercomPage.getMessagesTab();
        pages.testOpenIntercomPage.getSearchInput();
        pages.testOpenIntercomPage.getArticleDiscount();
        pages.testOpenIntercomPage.getArticleBooking();
        pages.testOpenIntercomPage.getArticleLessonTypes();
        pages.testOpenIntercomPage.getArticlePrices();
        pages.testOpenIntercomPage.getHelpCenterFooter();
        pages.testOpenIntercomPage.getSendMessageButton();
        pages.testOpenIntercomPage.getScrollArea();
        pages.testOpenIntercomPage.getCloseButton();
    }
}
