package test.tests.e2e;

import org.junit.Test;
import base.AppiumBaseTest;
import test.test_setup.BasePages;

public class RightMenuListTest extends AppiumBaseTest {

    @Test
    // Test Case #13
    public void testRightMenuListElements() {
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

        // Открываем правое меню
        pages.testDashboardPage.getLogoParent().click();

        // Проверка всех элементов
        pages.testRightMenuListPage.getPpSection();
        pages.testRightMenuListPage.getUserName();
        pages.testRightMenuListPage.getMishaIcon();
        pages.testRightMenuListPage.getNewStudentIcon();
        pages.testRightMenuListPage.getAccountIcon();
        pages.testRightMenuListPage.getSubscriptionIcon();
        pages.testRightMenuListPage.getBonusesIcon();
        pages.testRightMenuListPage.getLibrarySection();
        pages.testRightMenuListPage.getSpeakingPracticeIcon();
        pages.testRightMenuListPage.getHelpIcon();
        pages.testRightMenuListPage.getLogOutIcon();
        pages.testRightMenuListPage.getGoButton();
    }
}
