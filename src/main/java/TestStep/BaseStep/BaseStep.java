package TestStep.BaseStep;

import BaseClass.TestRunner;

import Object.Checkout.Checkout;
import Object.Concierge.Concierge;
import Object.ForgotPassword.ForgotPassword;
import Object.Login.Login;
import Object.Market.Market;
import Object.Profile.Profile;
import Object.Register.Register;
import Object.Sell.Sell;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.time.Duration;

public class BaseStep    {

    public static AndroidDriver<AndroidElement> driver ;

    public static Login objLogin = new Login(TestRunner.driver);
    public static ForgotPassword objForgotPassword = new ForgotPassword(TestRunner.driver);
    public static Register objRegister = new Register(TestRunner.driver);
    public static Profile objProfile = new Profile(TestRunner.driver);
    public static Market objMarket = new Market(TestRunner.driver);
    public static Checkout objCheckout = new Checkout(TestRunner.driver);
    public static Sell objSell = new Sell(TestRunner.driver);
    public static Concierge objConcierge = new Concierge(TestRunner.driver);

    public void scrollTouch(Integer times) {

        org.openqa.selenium.Dimension size = TestRunner.driver.manage().window().getSize();
        System.out.println(size);
        int width = size.width/2;
        int startPoint =(int) (size.getHeight()*0.7);
        System.out.println(startPoint);
        int endPoint =(int) (size.getHeight()*0.3);
        System.out.println(endPoint);
        TouchAction touchAction = new TouchAction(TestRunner.driver);

        for(int i=0;i<times;i++) {
            touchAction.press(width,startPoint).waitAction(Duration.ofSeconds(2)).moveTo(width,endPoint).release().perform();
        }

    }

}

