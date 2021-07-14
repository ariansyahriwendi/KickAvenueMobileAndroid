package TestStep.MakeOffer;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeOfferStep extends BaseStep {

    @When("I want to make offer")
    public void IWantToMakeOffer() {

    }

    @And("I select make offer")
    public void ISelectMakeOffer() throws InterruptedException {
        objCheckout.makeOfferButton.click();
        Thread.sleep(2000);
    }

    @And("I input make offer price {string}")
    public void IInputMakeOfferPrice(String price) throws InterruptedException {
        objCheckout.makeOfferPrice.sendKeys(price);
        Thread.sleep(2000);
    }

    @And("I click place offer")
    public void IClickPlaceOffer() throws InterruptedException {
        objCheckout.placeOffer.click();
        Thread.sleep(2000);
    }

    @And("I click view offer history")
    public void IClickViewOfferHistory() throws InterruptedException {
        objCheckout.viewOfferHistory.click();
        Thread.sleep(2000);
    }

    @Then("I make offer successfully")
    public void IMakeOfferSuccessfully() throws InterruptedException {
        Thread.sleep(4000);
    }

}
