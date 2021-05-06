package Object.AbstractObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public abstract class AbstractObject  {

    public static AndroidDriver<AndroidElement> driver;

    public AbstractObject(AndroidDriver<AndroidElement> driver) {

        AbstractObject.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }


}
