package Object.ForgotPassword;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class ForgotPassword extends AbstractObject {
    public ForgotPassword(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@contentDescription='login-forgot-password']")
    public AndroidElement forgotPasswordLink;

    @AndroidFindBy (xpath = "//*[@contentDescription='email-form-forgot-password']")
    public AndroidElement emailField;

    @AndroidFindBy (xpath = "//*[@contentDescription='reset-password']")
    public AndroidElement resetPasswordButton;
}
