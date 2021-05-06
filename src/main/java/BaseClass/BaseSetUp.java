package BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class BaseSetUp extends AbstractTestNGCucumberTests {

    public static AndroidDriver<AndroidElement> driver ;
    private static final DesiredCapabilities dc = new DesiredCapabilities();
    private static String baseEnv;
    public static String sprint;

    public static void setUp() throws IOException {
        loadProperties();

        System.out.println("Start Automation Test " + baseEnv);

        dc.setCapability(MobileCapabilityType.UDID, "RR8M50B5JNA");

        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.kickavenue.dev");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.kickavenue.androidshop.MainActivity");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);
        dc.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
    }

    private static void loadProperties() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/main/resources/TestData/config.properties"));
            baseEnv = properties.getProperty("BaseEnv");
            sprint = properties.getProperty("Sprint");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}