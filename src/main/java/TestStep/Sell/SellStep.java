package TestStep.Sell;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SellStep extends BaseStep {

    @When("I want to use sell request feature")
    public void IWantToUseSellRequestFeature() {

    }

    @And("I click sell")
    public void IClickSell() throws InterruptedException {
        Thread.sleep(7000);
        objSell.sellTab.click();
    }

    @And("I click sell sneakers")
    public void IClickSellSneakers() throws InterruptedException {
        objSell.sellSneakers.click();
        Thread.sleep(2000);
    }

    @And("I click sell streetwear")
    public void IClickSellStretwear() throws InterruptedException {
        objSell.sellStreetwear.click();
        Thread.sleep(2000);
    }

    @And("I click sell luxury")
    public void IClickSellLuxury() throws InterruptedException {
        objSell.sellLuxury.click();
        Thread.sleep(2000);
    }

    @And("I click sell lifestyle")
    public void IClickSellLifesyle() throws InterruptedException {
        objSell.sellLifestyle.click();
        Thread.sleep(2000);
    }

    @And("I select photo")
    public void ISelectPhoto() {
        objSell.image1.click();
        objSell.image2.click();
        objSell.image3.click();
        objSell.image4.click();
        objSell.image5.click();
        objSell.image6.click();
    }

    @And("I select photo streetwear")
    public void ISelectPhotoStreetwear() {
        objSell.image1.click();
        objSell.image2.click();
        objSell.image3.click();
        objSell.image4.click();
        objSell.image5.click();
    }

    @And("I select photo lifestyle")
    public void ISelectPhotoLifestyle() {
        objSell.image1.click();
        objSell.image2.click();
        objSell.image3.click();
        objSell.image4.click();
        objSell.image5.click();
    }

    @And("I click next")
    public void IClickNext() {
        objSell.nextButton.click();
    }

    @And("I select category sneakers")
    public void ISelectCategorySneakers() {
        objSell.selectCategorySneakers.click();
    }

    @And("I select category streetwear")
    public void ISelectCategoryStreetwear() {
        objSell.selectCategoryStreetwear.click();
    }

    @And("I select category luxury")
    public void ISelectCategoryLuxury() {
        objSell.selectCategoryLuxury.click();
    }

    @And("I select category lifestyle")
    public void ISelectCategoryLifestyle() {
        objSell.selectCategoryLifestyle.click();
    }

    @And("I input product name {string}")
    public void IInputProductName(String product) throws InterruptedException {
        objSell.inputProduct.click();
        objSell.inputProductField.sendKeys(product);
        Thread.sleep(3000);
    }

    @And("I select product sneakers sell")
    public void ISelectProductSneakersSell() throws InterruptedException {
        objSell.productSneakers.click();
        objSell.productSneakers.click();
        Thread.sleep(4000);
    }

    @And("I select product streetwear sell")
    public void ISelectProductStreetwearSell() throws InterruptedException {
        objSell.productStreetwear.click();
        objSell.productStreetwear.click();
        Thread.sleep(4000);
    }

    @And("I select product luxury sell")
    public void ISelectProductLuxurySell() throws InterruptedException {
        objSell.productLuxury.click();
        objSell.productLuxury.click();
        Thread.sleep(4000);
    }

    @And("I select product lifestyle sell")
    public void ISelectProductLifestyleSell() throws InterruptedException {
        objSell.productLifestyle.click();
        objSell.productLifestyle.click();
        Thread.sleep(4000);
    }

    @And("I select size sneakers sell")
    public void ISelectSizeSneakersSell() {
        objSell.sizeField.click();
        objSell.selectSize8.click();
    }

    @And("I select size streetwear sell")
    public void ISelectSizeStreetwearSell() {
        objSell.sizeFieldStreetwear.click();
        objSell.selectSizeAllSize.click();
    }

    @And("I select size lifestyle sell")
    public void ISelectSizeLifestyleSell() {
        objSell.sizeFieldLifestyle.click();
        objSell.selectSizeAllSize.click();
    }

    @And("I select sneakers condition")
    public void ISelectSneakersCondition() {
        objSell.sneakersCondition.click();
        objSell.sneakersConditionNew.click();
    }

    @And("I select sneakers box condition")
    public void ISelectSneakersBoxCondition() {
        objSell.boxCondition.click();
        objSell.perfectBox.click();
    }

    @And("I select streetwear condition")
    public void ISelectStreetwearCondition() {
        objSell.selectProductCondition.click();
        objSell.streetwearConditionBrandNew.click();
    }

    @And("I select luxury condition")
    public void ISelectLuxuryCondition() {
        objSell.selectLuxuryCondition.click();
        objSell.streetwearConditionBrandNew.click();
    }

    @And("I select luxury box condition")
    public void ISelectLuxuryBoxCondition() {
        objSell.boxCondition.click();
        objSell.perfectBox.click();
    }


    @And("I select lifestyle condition")
    public void ISelectLifestyleCondition() {
        objSell.selectProductCondition.click();
        objSell.streetwearConditionBrandNew.click();
    }

    @And("I select lifestyle box condition")
    public void ISelectLifestyleBoxCondition() {
        objSell.boxCondition.click();
        objSell.missingBox.click();
    }

    @And("I input sell price {string}")
    public void IInputSellPrice(String price) {
        scrollTouch(2);
        objSell.inputPrice.sendKeys(price);
    }

    @And("I click submit sell")
    public void IClickSubmitSell() {
        objSell.submit.click();
    }

    @Then("I sell successfully")
    public void ISellSuccessfully() throws InterruptedException {
        Thread.sleep(10000);
    }
}
