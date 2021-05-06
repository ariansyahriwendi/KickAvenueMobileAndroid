package Object.Register;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Register extends AbstractObject {
    public Register(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='profile-register']")
    public AndroidElement registerButton;

    @AndroidFindBy(xpath = "//*[@content-desc='register-email']")
    public AndroidElement registerEmailField;

    @AndroidFindBy(xpath = "//*[@content-desc='register-password']")
    public AndroidElement registerPasswordField;

    @AndroidFindBy(xpath = "//*[@content-desc='register-confirm-password']")
    public AndroidElement registerConfirmPasswordField;

    @AndroidFindBy(xpath = "//*[@content-desc='register-show-password']")
    public AndroidElement registerShowPasswordButton;

    @AndroidFindBy(xpath = "//*[@content-desc='register-show-confirm-password']")
    public AndroidElement registerShowConfirmPasswordButton;

    @AndroidFindBy(xpath = "//*[@content-desc='register-country']")
    public AndroidElement registerSelectCountryField;

    @AndroidFindBy(xpath = "//*[@content-desc='register-province']")
    public AndroidElement registerSelectProvinceField;

    @AndroidFindBy(xpath = "//*[@content-desc='register-submit']")
    public AndroidElement registerSubmitButton;

    @AndroidFindBy(xpath = "//*[@content-desc='register-google']")
    public AndroidElement registerGoogleButton;

    @AndroidFindBy(xpath = "//*[@content-desc='register-facebook']")
    public AndroidElement registerFacebookButton;

}
