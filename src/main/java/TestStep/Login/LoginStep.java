package TestStep.Login;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseStep {

    @Given("I am guest user")
    public void iAmGuestUser() {
    }

    @When("I want to login")
    public void iWantToLogin(){
    }

    @And("I click profile")
    public void iClickProfile() throws InterruptedException {
        Thread.sleep(7000);
        objLogin.profileButton.click();
        Thread.sleep(3000);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        objLogin.loginButton.click();
    }

    @And("I input email {string}")
    public void iInputEmail(String email) {
        objLogin.emailField.sendKeys(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        objLogin.showHidePassword.click();
        objLogin.passwordField.sendKeys(password);
    }

    @And("I click login submit button")
    public void iClickLoginSubmitButton() throws InterruptedException {
        objLogin.loginSubmitButton.click();
        Thread.sleep(3000);
    }

    @Then("I login successfully")
    public void iLoginSuccessfully(){
    }

    @And("I click logout button")
    public void iClickLogoutButton() throws InterruptedException {
        objLogin.logoutButton.click();
        Thread.sleep(3000);
    }

    @Then("I logout successfully")
    public void iLogoutSuccessfully() {
    }

    @Given("I am user logout")
    public void iAmUserLogout() {
    }

    @When("I want to logout")
    public void iWantToLogout(){
    }

    @And("I click continue with google button")
    public void iClickContinueWithGoogleButton() throws InterruptedException {
        objLogin.loginGoogleButton.click();
        Thread.sleep(2000);
    }

    @And("I click continue with facebook button")
    public void iClickContinueWithFacebookButton() throws InterruptedException {
        objLogin.loginFacebookButton.click();
        Thread.sleep(2000);
    }

}
