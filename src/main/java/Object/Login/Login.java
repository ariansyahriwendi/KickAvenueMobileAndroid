package Object.Login;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login extends AbstractObject {
    public Login(AndroidDriver<AndroidElement>driver) {
        super(driver);
    }

    @AndroidFindBy (xpath = "//*[@content-desc='profile_tab']")
    public AndroidElement profileButton;

    @AndroidFindBy (xpath = "//*[@content-desc='profile-login']")
    public AndroidElement loginButton;

    @AndroidFindBy (xpath = "//*[@contentDescription='login-email']")
    public AndroidElement emailField;

    @AndroidFindBy (xpath = "//*[@contentDescription='login-password']")
    public AndroidElement passwordField;

    @AndroidFindBy (xpath = "//*[@contentDescription='show-password']")
    public AndroidElement showHidePassword;

    @AndroidFindBy (xpath = "//*[@contentDescription='login-submit']")
    public AndroidElement loginSubmitButton;

    @AndroidFindBy (xpath = "//*[@contentDescription='profile-logout-button']")
    public AndroidElement logoutButton;

    @AndroidFindBy (xpath = "//*[@content-desc='login-google']")
    public AndroidElement loginGoogleButton;

    @AndroidFindBy (xpath = "//*[@contentDescription='login-facebook']")
    public AndroidElement loginFacebookButton;

}