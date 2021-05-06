package TestStep.Register;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Th;

public class RegisterStep extends BaseStep {

    @When("I want to register")
    public void iWantToRegister(){
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        objRegister.registerButton.click();
    }

    @And("I input register email")
    public void iInputRegisterEmail() {
        objRegister.registerEmailField.sendKeys("ariansyahriwendi@gmail.com");
    }

    @And("I input register password")
    public void iInputRegisterPassword() {
        objRegister.registerShowPasswordButton.click();
        objRegister.registerPasswordField.sendKeys("Passwordkickavenue");
    }

    @And("I input register confirm password")
    public void iInputRegisterConfirmPassword() {
        objRegister.registerShowConfirmPasswordButton.click();
        objRegister.registerConfirmPasswordField.sendKeys("Passwordkickavenue");
    }

    @And("I input register select country")
    public void iInputRegisterSelectCountry() {
        objRegister.registerSelectCountryField.sendKeys("Indonesia");
    }

    @And("I input register select province")
    public void iInputRegisterSelectProvince() {
        objRegister.registerSelectProvinceField.sendKeys("Banten");
    }

    @And("I click register submit button")
    public void iClickRegisterSubmitButton() {
        objRegister.registerSubmitButton.click();
    }

    @Then("I register successfully")
<<<<<<< HEAD
    public void iRegisterSuccessfully() {
=======
    public void iRegisterSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
>>>>>>> dc37aee (Initial commit)

    }

    @And("I click register google button")
    public void iClickRegisterGoogleButton() throws InterruptedException {
        Thread.sleep(2000);
        objRegister.registerGoogleButton.click();
<<<<<<< HEAD
        Thread.sleep(2000);
=======
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click register facebook button")
    public void iClickRegisterFacebookButton() throws InterruptedException {
        objRegister.registerFacebookButton.click();
<<<<<<< HEAD
        Thread.sleep(2000);
=======
>>>>>>> dc37aee (Initial commit)
    }

}
