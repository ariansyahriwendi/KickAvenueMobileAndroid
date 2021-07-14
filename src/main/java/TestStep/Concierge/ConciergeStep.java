package TestStep.Concierge;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConciergeStep extends BaseStep {

    @When("I want to use concierge service")
    public void IWantToUseConciergeService() {

    }

    @And("I click home")
    public void IClickHome() throws InterruptedException {
        Thread.sleep(7000);
        objConcierge.homeTab.click();

    }

    @And("I click home luxury")
    public void IClickHomeLuxury() throws InterruptedException {
        objConcierge.homeLuxury.click();
        Thread.sleep(3000);
    }

    @And("I click concierge service")
    public void IClickConciergeService() {
        objConcierge.conciergeServiceButton.click();
    }

    @And("I click see my concierge list")
    public void IClickSeeMyConciergeList() {
        objConcierge.seeMyConciergeList.click();
        objConcierge.back.click();
    }

    @And("I input concierge name {string}")
    public void IInputConciergeName(String name) {
        scrollTouch(1);
        objConcierge.nameField.sendKeys(name);
    }

    @And("I input concierge phone number {string}")
    public void IInputConciergePhoneNumber(String phone) {
        objConcierge.phoneNumberField.sendKeys(phone);

    }

    @And("I input concierge product name {string}")
    public void IInputConciergeProductName(String product) {
        objConcierge.productNameField.sendKeys(product);
    }

    @And("I select concierge condition")
    public void ISelectConciergeCondition() {
        objConcierge.brandNewButton.click();
        objConcierge.usedButton.click();
    }

    @And("I select concierge shipping address")
    public void ISelectConciergeShippingAddress() {

    }

    @And("I select image concierge")
    public void ISelectImageConcierge() throws InterruptedException {
        scrollTouch(2);
        objConcierge.selectImageButton.click();
        Thread.sleep(3000);
        objConcierge.selectImage1.click();
    }

    @And("I click submit concierge")
    public void IClickSubmitConcierge() throws InterruptedException {
        objConcierge.submitConciergeButton.click();
        Thread.sleep(3000);
        objConcierge.closeConcierge.click();
    }

    @Then("I use concierge service successfully")
    public void IUseConciergeServiceSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
    }




}
