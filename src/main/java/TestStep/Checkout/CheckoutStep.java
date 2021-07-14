package TestStep.Checkout;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep extends BaseStep {

    @When("I want to checkout")
    public void IWantToCheckout() {

    }

    @And("I click sneakers checkout")
    public void IClickSneakersCheckout() throws InterruptedException {
        Thread.sleep(1000);
        objMarket.marketStreetwear.click();
        Thread.sleep(1000);
        objMarket.marketSneakers.click();
        Thread.sleep(2000);
    }

    @And("I click streetwear checkout")
    public void IClickStreetwearCheckout() throws InterruptedException {
        Thread.sleep(1000);
        objMarket.marketStreetwear.click();
        Thread.sleep(2000);
    }

    @And("I click luxury checkout")
    public void IClickLuxuryCheckout() throws InterruptedException {
        Thread.sleep(1000);
        objMarket.marketLuxury.click();
        Thread.sleep(2000);
    }

    @And("I click lifestyle checkout")
    public void IClickLifestyleCheckout() throws InterruptedException {
        Thread.sleep(1000);
        objMarket.marketLifestyle.click();
        Thread.sleep(2000);
    }

    @And("I click result found sneakers checkout")
    public void IClickResultFoundSneakersCheckout() throws InterruptedException {
        objMarket.resultFoundSneakers.click();
        Thread.sleep(3000);
    }

    @And("I click result found streetwear checkout")
    public void IClickResultFoundStreetwearCheckout() throws InterruptedException {
        objMarket.resultFoundStreetwear.click();
        Thread.sleep(3000);
    }

    @And("I click result found luxury checkout")
    public void IClickResultFoundLuxuryCheckout() throws InterruptedException {
        objMarket.resultFoundLuxury.click();
        Thread.sleep(3000);
    }

    @And("I click result found lifestyle checkout")
    public void IClickResultFoundLifestyleCheckout() throws InterruptedException {
        objMarket.resultFoundLifestyle.click();
        Thread.sleep(3000);
    }

    @And("I select product sneakers")
    public void ISelectProductSneakers() throws InterruptedException {
        Thread.sleep(3000);
        objCheckout.productSneakers.click();
        Thread.sleep(5000);
    }

    @And("I select product streetwear")
    public void ISelectProductStreetwear() throws InterruptedException {
        Thread.sleep(3000);
        objCheckout.productStreetwear.click();
        Thread.sleep(5000);
    }

    @And("I select product luxury")
    public void ISelectProductLuxury() throws InterruptedException {
        Thread.sleep(3000);
        objCheckout.productLuxury.click();
        Thread.sleep(5000);
    }

    @And("I select product lifestyle")
    public void ISelectProductLifestyle() throws InterruptedException {
        Thread.sleep(3000);
        objCheckout.productLifestyle.click();
        Thread.sleep(5000);
    }

    @And("I click new")
    public void IClickNew() throws InterruptedException {
        objCheckout.buttonNew.click();
        Thread.sleep(3000);
    }

    @And("I select size checkout")
    public void ISelectSizeCheckout() throws InterruptedException {
        objCheckout.selectSize.click();
        Thread.sleep(4000);
    }

    @And("I click pick payment method")
    public void IClickPickPaymentMethod() throws InterruptedException {
        objCheckout.pickPaymentMethod.click();
        Thread.sleep(4000);
    }

    @And("I select kick credit payment")
    public void ISelectKickCreditPayment() throws InterruptedException {
        objCheckout.selectPaymentKickCredit.click();
        Thread.sleep(2000);
    }

    @And("I click view details")
    public void IClickViewDetails() throws InterruptedException {
        objCheckout.viewDetailPrice.click();
        Thread.sleep(2000);
        objCheckout.closePriceDetail.click();
        Thread.sleep(2000);
    }

    @And("I click place order")
    public void IClickPlaceOrder() throws InterruptedException {
        objCheckout.placeOrder.click();
        Thread.sleep(10000);
    }

    @And("I click view order history")
    public void IClickViewOrderHistory() throws InterruptedException {
        objCheckout.viewOrderHistory.click();
        Thread.sleep(2000);
    }

    @Then("I checkout successfully")
    public void ICheckoutSuccessfully() throws InterruptedException {
        Thread.sleep(3000);

    }

    @And("I select BCA Installments")
    public void ISelectBCAInstallments() throws InterruptedException {
        objCheckout.selectPaymentBCAInstallments.click();
        Thread.sleep(2000);
    }

    @And("I select BCA Credit Card")
    public void ISelectBCACreditCard() throws InterruptedException {
        objCheckout.selectPaymentBCACreditCard.click();
        Thread.sleep(2000);
    }

    @And("I select Mandiri Installments")
    public void ISelectMandiriInstallments() throws InterruptedException {
        objCheckout.selectPaymentMandiriInstallments.click();
        Thread.sleep(2000);
    }

    @And("I select Credit Card")
    public void ISelectCreditCard() throws InterruptedException {
        objCheckout.selectPaymentCreditCard.click();
        Thread.sleep(2000);
    }

    @And("I select BCA Virtual Account")
    public void ISelectBCAVirtualAccount() throws InterruptedException {
        objCheckout.selectPaymentVirtualAccountBCA.click();
        Thread.sleep(2000);
    }

    @And("I select Mandiri Virtual Account")
    public void ISelectMandiriVirtualAccount() throws InterruptedException {
        scrollTouch(1);
        objCheckout.selectPatmentVirtualAccountMandiri.click();
        Thread.sleep(2000);
    }

    @And("I select Permata Virtual Account")
    public void ISelectPermataVirtualAccount() throws InterruptedException {
        scrollTouch(1);
        objCheckout.selectPaymentVirtualAccountPermata.click();
        Thread.sleep(2000);
    }

    @And("I select BNI Virtual Account")
    public void ISelectBNIVirtualAccount() throws InterruptedException {
        scrollTouch(1);
        objCheckout.selectPaymentVirtualAccountBNI.click();
        Thread.sleep(2000);
    }

    @And("I select BRI Virtual Account")
    public void ISelectBRIVirtualAccount() throws InterruptedException {
        scrollTouch(1);
        objCheckout.selectPaymentVirtualAccountBRI.click();
        Thread.sleep(2000);
    }

    @And("I select Gopay Virtual Account")
    public void ISelectGopayVirtualAccount() throws InterruptedException {
        scrollTouch(2);
        objCheckout.selectPaymentVirtualAccountGopay.click();
        Thread.sleep(2000);
    }

    @And("I select Other Virtual Account")
    public void ISelectOtherVirtualAccount() throws InterruptedException {
        scrollTouch(2);
        objCheckout.selectPaymentVirtualAccountGopay.click();
        Thread.sleep(2000);
    }

    @And("I select Atome")
    public void ISelectAtome() throws InterruptedException {
        scrollTouch(2);
        objCheckout.selectPaymentOnlineInstallmentAtome.click();
        Thread.sleep(2000);
        objCheckout.chooseTenure.click();
    }

    @And("I select Kredivo")
    public void ISelectKredivo() throws InterruptedException {
        scrollTouch(2);
        objCheckout.selectPaymentOnlineInstallmentKredivo.click();
        Thread.sleep(2000);
        objCheckout.chooseTenureKredivo30Hari.click();
    }

    @And("I select BCA Bank Transfer")
    public void ISelectBCABankTransfer() throws InterruptedException {
        scrollTouch(3);
        objCheckout.selectPaymentBankTransferBCA.click();
        Thread.sleep(2000);
    }

    @And("I select Mandiri Bank Transfer")
    public void ISelectMandiriBankTransfer() throws InterruptedException {
        scrollTouch(3);
        objCheckout.selectPaymentBankTransferMandiri.click();
        Thread.sleep(2000);
    }

}
