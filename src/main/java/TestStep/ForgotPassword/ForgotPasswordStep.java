package TestStep.ForgotPassword;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordStep extends BaseStep {

    @When("I want to use forgot password")
    public void IWantToUseForgotPassword() {
    }

    @And("I click forgot password link")
    public void iClickForgotPasswordLink() throws InterruptedException {
        objForgotPassword.forgotPasswordLink.click();
        Thread.sleep(2000);
    }

    @And("I input email forgot password {string}")
<<<<<<< HEAD
    public void IInputEmailForgotPassword(String email) throws InterruptedException {
        objForgotPassword.emailField.sendKeys(email);
        Thread.sleep(2000);
    }

    @And("I click reset password button")
    public void IClickResetPasswordButton() throws InterruptedException {
        objForgotPassword.resetPasswordButton.click();
        Thread.sleep(2000);
=======
    public void IInputEmailForgotPassword(String email) {
        objForgotPassword.emailField.sendKeys(email);
    }

    @And("I click reset password button")
    public void IClickResetPasswordButton() {
        objForgotPassword.resetPasswordButton.click();

>>>>>>> dc37aee (Initial commit)

    }

    @Then("I forgot password successfully")
<<<<<<< HEAD
    public void IForgotPasswordSuccessfully() {

=======
    public void IForgotPasswordSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
>>>>>>> dc37aee (Initial commit)
    }


}
