package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;

public class FirstScreenTest extends base.AppiumBaseTest {

    @Test
    // Test Case #1
    public void testFirstScreen() {
        FirstScreenPage firstScreen = new FirstScreenPage(driver);

        //Check FirstScreenPage elements
        firstScreen.getSkipButton();
        firstScreen.getOnlineLessonImage();
        firstScreen.getContinueElement();
        firstScreen.getButtonForward();


    }
}
