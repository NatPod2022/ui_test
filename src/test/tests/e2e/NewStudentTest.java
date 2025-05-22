package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class NewStudentTest extends base.AppiumBaseTest {

    @Test
    // Test Case #XX — проверка отображения элементов на экране New Student
    public void testNewStudentPageElements() throws InterruptedException {
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

        // Открываем правое меню
        pages.testDashboardPage.getLogoParent().click();

        //Click на New student
        pages.testRightMenuListPage.getNewStudentIcon().click();


        //* Проверка отображения элементов
        pages.testNewStudentPage.getBackButton();
        pages.testNewStudentPage.getNewStudentTitle();
        pages.testNewStudentPage.getGirlRadioButton();
        pages.testNewStudentPage.getGirlLabel();
        pages.testNewStudentPage.getBoyRadioButton();
        pages.testNewStudentPage.getBoyLabel();
        pages.testNewStudentPage.getFirstNameInput();
        pages.testNewStudentPage.getLastNameInput();
        pages.testNewStudentPage.getAddNewChildButton();
    }
}
