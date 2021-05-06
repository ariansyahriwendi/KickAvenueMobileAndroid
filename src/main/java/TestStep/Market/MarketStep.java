package TestStep.Market;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarketStep extends BaseStep {

    @When("I want view product market sneakers")
    public void IWantViewProductMarketSneakers() {

    }

    @And("I click market")
    public void IClickMarket() throws InterruptedException {
        <<<<<<< HEAD
        Thread.sleep(7000);
=======
        Thread.sleep(9000);
>>>>>>> dc37aee (Initial commit)
        objMarket.marketTab.click();
    }

    @And("I click sneakers")
    public void IClickSneakers() throws InterruptedException {
        objMarket.marketStreetwear.click();
        objMarket.marketSneakers.click();
        Thread.sleep(2000);
<<<<<<< HEAD
        scrollTouch(3);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
        Thread.sleep(2000);

    }

    @And("I click search sneakers market")
    public void IClickSearchSneakersMarket() throws InterruptedException {
        objMarket.searchMarketSneakers.click();
        Thread.sleep(5000);
    }

    @And("I click search streetwear market")
    public void IClickSearchStreetwearMarket() throws InterruptedException {
        objMarket.searchMarketStreetwear.click();
        Thread.sleep(5000);
    }

    @And("I click search luxury market")
    public void IClickSearchLuxuryMarket() throws InterruptedException {
        objMarket.searchMarketLuxury.click();
        Thread.sleep(5000);
    }

    @And("I click search lifestyle market")
    public void IClickSearchLifestyleMarket() throws InterruptedException {
        objMarket.searchMarketLifeStyle.click();
        Thread.sleep(5000);
    }

    @And("I input {string}")
    public void IInput(String search) throws InterruptedException {
<<<<<<< HEAD
        objMarket.searchMarketInput.clear();
        objMarket.searchMarketInput.sendKeys(search);
        Thread.sleep(5000);
=======
        Thread.sleep(1000);
        objMarket.searchMarketInput.clear();
        objMarket.searchMarketInput.sendKeys(search);
        Thread.sleep(3000);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click result found sneakers")
    public void IClickResultFoundSneakers() throws InterruptedException {
        objMarket.resultFoundSneakers.click();
        Thread.sleep(3000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(3000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click result found streetwear")
    public void IClickResultFoundStreetwear() throws InterruptedException {
        objMarket.resultFoundStreetwear.click();
        Thread.sleep(5000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(5000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click result found luxury")
    public void IClickResultFoundLuxury() throws InterruptedException {
        objMarket.resultFoundLuxury.click();
        Thread.sleep(5000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(5000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click result found lifestyle")
    public void IClickResultFoundLifestyle() throws InterruptedException {
        objMarket.resultFoundLifestyle.click();
        Thread.sleep(5000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(5000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click back to search")
    public void IClickBackToSearch() throws InterruptedException {
        objMarket.backToSearch.click();
        Thread.sleep(1000);
    }


    @Then("I search product successfully")
    public void ISearchProductSuccessfully() throws InterruptedException {
<<<<<<< HEAD
        Thread.sleep(5000);
=======
        Thread.sleep(3000);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click filter sneakers")
    public void IClickFilterSneakers() {
        objMarket.filterSneakers.click();
    }

    @And("I click filter streetwear")
    public void IClickFilterStreetwear() {
        objMarket.filterStreetwear.click();
    }

    @And("I click filter luxury")
    public void IClickFilterLuxury() {
        objMarket.filterLuxury.click();
    }

    @And("I click filter lifestyle")
    public void IClickFilterLifestyle() {
        objMarket.filterLifeStyle.click();
    }

    @And("I click filter")
    public void IClickFilter() throws InterruptedException {
        objMarket.filter.click();
        Thread.sleep(3000);
    }

    @And("I click sort by most popular")
    public void IClickSortByMostPopular() {
        objMarket.sortByMostPopular.click();
        objMarket.sortByMostPopular.click();
    }

    @And("I click sort by best match")
    public void IClickSortByBestMatch() {
        objMarket.sortByBestMatch.click();
    }

    @And("I click sort by price high to low")
    public void IClickSortByPriceHighToLow() {
        objMarket.sortByHighLow.click();
    }

    @And("I click sort by price low to high")
    public void IClickSortByPriceLowToHigh() {

    }

    @And("I click gender men")
    public void IClickGenderMen() {
        objMarket.genderMen.click();
    }

    @And("I click gender women")
    public void IClickGenderWomen() {
        objMarket.genderMen.click();
        objMarket.genderWomen.click();
    }

    @And("I click gender youth kid")
    public void IClickGenderYouthKid() {
        objMarket.genderWomen.click();
        objMarket.genderYouthKid.click();
    }

    @And("I click condition new")
    public void IClickConditionNew() {
        objMarket.genderMen.click();
        objMarket.genderWomen.click();
        objMarket.conditionNew.click();
    }

    @And("I click condition new lifestyle")
    public void IClickConditionNewLifestyle() {
        objMarket.conditionNew.click();
    }

    @And("I click condition used")
    public void IClickConditionUsed() {
        objMarket.conditionUsed.click();
    }

    @And("I click condition pre order")
    public void IClickConditionPreOrder() {
        objMarket.conditionPreOrder.click();
    }

    @And("I click condition pre verified")
    public void IClickConditionPreVerified() {

    }

    @And("I select size")
    public void ISelectSize() {

    }

    @And("I click brand adidas")
    public void IClickBrandAdidas() {
        objMarket.brandAdidas.click();
    }

    @And("I click brand adidas stan smith")
    public void IClickBrandAdidasStanSmith() {
        objMarket.brandAdidas.click();
        objMarket.brandAdidasStanSmith.click();
    }

    @And("I click color red")
    public void IClickColorRed() {
        objMarket.brandAdidasStanSmith.click();
        objMarket.colorRed.click();
    }

    @And("I click color black")
    public void IClickColorBlack() {
        objMarket.colorRed.click();
        objMarket.colorBlack.click();
    }

    @And("I click apply filter")
    public void IClickApplyFilter() throws InterruptedException {
        objMarket.applyFilter.click();
        Thread.sleep(3000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(3000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)

    }

    @Then("I use filter search successfully")
    public void IUseFilterSearchSuccessfully() throws InterruptedException {
<<<<<<< HEAD
        Thread.sleep(5000);
=======
        Thread.sleep(3000);
>>>>>>> dc37aee (Initial commit)
    }

    @When("I want view product market streetwear")
    public void IWantViewProductMarketStreetwear() {

    }

    @And("I click streetwear")
    public void IClickStreetwear() throws InterruptedException {
<<<<<<< HEAD
        objMarket.marketStreetwear.click();
        Thread.sleep(2000);
        scrollTouch(3);
        Thread.sleep(2000);
=======
        Thread.sleep(2000);
        objMarket.marketStreetwear.click();
        Thread.sleep(2000);
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click brand 88rising")
    public void IClickBrand88rising() {

    }

    @And("I click brand aape")
    public void IClickBrandAape() {

    }

    @When("I want view product market luxury")
    public void IWantViewProductMarketLuxury() {

    }

    @And("I click luxury")
    public void IClickLuxury() throws InterruptedException {
<<<<<<< HEAD
        objMarket.marketLuxury.click();
        Thread.sleep(2000);
        scrollTouch(3);
        Thread.sleep(2000);
=======
        Thread.sleep(2000);
        objMarket.marketLuxury.click();
        Thread.sleep(2000);
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click condition brand new")
    public void IClickConditionBrandNew() {
        objMarket.conditionBrandNew.click();
    }

    @And("I click condition pristine")
    public void IClickConditionPristine() {
        objMarket.conditionPristine.click();
    }

    @And("I click condition good")
    public void IClickConditionGood() {
        objMarket.conditionGood.click();
    }

    @And("I click condition well used")
    public void IClickConditionWellUsed() {

    }

    @And("I click condition like new")
    public void IClickConditionLikeNew() {

    }

    @And("I click condition vintage")
    public void IClickConditionVintage() {

    }

    @And("I click brand 31 phillip lim")
    public void IClickBrand31PhillipLim() {

    }

    @And("I click brand acne studio")
    public void IClickBrandAcneStudio() {

    }

    @And("I want view product market lifestyle")
    public void IWantViewProductMarketLifestyle() {

    }

    @And("I click lifestyle")
    public void IClickLifestyle() throws InterruptedException {
        objMarket.marketLifestyle.click();
        Thread.sleep(2000);
<<<<<<< HEAD
        scrollTouch(3);
        Thread.sleep(2000);
=======
        scrollTouch(2);
>>>>>>> dc37aee (Initial commit)
    }

    @And("I click category collectibles")
    public void IClickCategory() {

    }

    @And("I click category bike")
    public void IClickCategoryBike() {
        objMarket.filterCategoryBike.click();
    }


}