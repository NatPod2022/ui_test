package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class LibraryPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #18 — Проверка отображения элементов на экране LibraryPage
    public void testLibraryPageElements() throws InterruptedException {
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

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

        // Переход на LibraryPage
        pages.testRightMenuListPage.getLibrarySection().click();

        // Проверка отображения элементов
        pages.testLibraryPage.getBackButton();
        pages.testLibraryPage.getBeginnersGroupsButton();
    }
}
