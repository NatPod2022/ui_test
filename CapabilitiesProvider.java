package test.configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesProvider {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "and82");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.novakid.student");
        capabilities.setCapability("appActivity", "com.novakid.student.MainActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "C:/Users/Natalia/OneDrive/Рабочий стол/JavaAppiumAutomation/apks/app-prod.apk");
        capabilities.setCapability("newCommandTimeout", 300);
        capabilities.setCapability("adbExecTimeout", 60000);

        return capabilities;
    }
}
