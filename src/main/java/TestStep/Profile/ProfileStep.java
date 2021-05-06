package TestStep.Profile;

import TestStep.BaseStep.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileStep extends BaseStep {

    @Given("I am user")
    public void iAmUser() {

    }

    @When("I want to use notification")
    public void IWantToUseNotification() {

    }

    @And("I click notification button")
    public void IClickNotificationButton() {
        objProfile.notificationButton.click();
    }

    @Then("I use notification successfully")
    public void IUseNotificationSuccessfully() throws InterruptedException {
        Thread.sleep(6000);

    }

    @When("I want to use kick credit")
    public void IWantToUseKickCredit() {

    }

    @And("I click kick credit")
    public void IClickKickCredit() throws InterruptedException {
        objProfile.kickCreditButton.click();
        Thread.sleep(2000);

    }

    @And("I click wallet logs")
    public void IClickWalletLogs() throws InterruptedException {
        objProfile.walletLogs.click();
        Thread.sleep(2000);
    }

    @And("I click pending cash out")
    public void IClickPendingCashOut() throws InterruptedException {
        objProfile.pendingCashOut.click();
        Thread.sleep(2000);
    }

    @And("I click pending top up")
    public void IClickPendingTopUp() throws InterruptedException {
        objProfile.pendingTopUp.click();
        Thread.sleep(2000);

    }

    @Then("I use kick credit successfully")
    public void IUseKickCreditSuccessfully() {

    }

    @And("I click top up")
    public void IClickTopUp() throws InterruptedException {
        objProfile.topUpButton.click();
        Thread.sleep(2000);
    }

    @And("I input amount top up kick credit {string}")
    public void IInputAmountTopUpKickCredit(String amount) {
        objProfile.topUpAmountField.sendKeys(amount);

    }

    @And("I click continue top up kick credit")
    public void IClickContinueTopUpKickCredit() throws InterruptedException {
        Thread.sleep(2000);
        objProfile.continueButton.click();

    }

    @And("I choose payment bca top up kick credit")
    public void IChoosePaymentBcaTopUpKickCredit() {
        objProfile.topUpBca.click();
    }

    @And("I click continue your payment")
    public void IClickContinueYourPayment() {
        objProfile.continueYourPayment.click();
    }

    @Then("I use top up successfully")
    public void IUseTopUpSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("I click cash out")
    public void IClickCashOut() {
        objProfile.cashOutButton.click();
    }

    @And("I input amount cash out kick credit {string}")
    public void IInputAmountCashOutKickCredit(String amount) {
        objProfile.cashOutAmountField.sendKeys(amount);
    }

    @And("I click continue cash out kick credit")
    public void IClickContinueCashOutKickCredit() {
        objProfile.continueButton.click();
    }

    @And("I click confirm cash out")
    public void IClickConfirmCashOut() {
        objProfile.confirmCashOut.click();
    }

    @And("I input password cash out {string}")
    public void IInputPasswordCashOut(String password) {
        objProfile.inputPasswordCashOut.sendKeys(password);
    }

    @And("I click submit cash out")
    public void IClickSubmitCashOut() {
        objProfile.submitCashOut.click();
    }

    @And("I close pop up success cash out")
    public void IClosePopUpSuccessCashOut() {

    }

    @Then("I use cash out successfully")
    public void IUseCashOutSuccessfully() {

    }

    @And("I want to use seller credit")
    public void IWantToUseSellerCredit() {

    }

    @And("I click seller credit")
    public void IClickSellerCredit() {
        objProfile.sellerCreditButton.click();
    }

    @Then("I use seller credit successfully")
    public void IUseSellerCreditSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("I click seller credit info")
    public void IClickSellerCreditInfo() {
        objProfile.sellerCreditInfoButton.click();

    }

    @And("I want to use kick reward")
    public void IWantToUseKickReward() {

    }

    @And("I click kick reward")
    public void IClickKickReward() throws InterruptedException {
        Thread.sleep(2000);
        objProfile.kickRewardButton.click();
        Thread.sleep(4000);
    }

    @And("I click kick reward history")
    public void IClickKickRewardHistory() {
        objProfile.historyKickRewardButton.click();
    }

    @Then("I use kick reward successfully")
    public void IUseKickRewardSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("I want to use invite a friend")
    public void IWantToUseInviteAFriend() {

    }

    @And("I click invite a friend")
    public void IClickInviteAFriend() throws InterruptedException {
        objProfile.inviteAFriendButton.click();
        Thread.sleep(3000);
    }

    @And("I click copy referral code")
    public void IClickCopyReferralCode() {
        objProfile.copyReferralCode.click();

    }

    @And("I click how to use invite a friend")
    public void IClickHowToUseInviteAFriend() throws InterruptedException {
        objProfile.howToUseInviteAFriend.click();
        Thread.sleep(2000);
       objProfile.goBackButton.click();
    }

    @And("I click invite a friend button")
    public void IClickInviteAFriendButton() {
        objProfile.inviteAFriend.click();
    }

    @Then("I use invite a friend successfully")
    public void IUseInviteAFriendSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("I want to use buying")
    public void IWantToUseBuying() {

    }

    @And("I click buying")
    public void IClickBuying() {
        objProfile.buyingButton.click();
    }

    @And("I click offers")
    public void IClickOffers() throws InterruptedException {
        objProfile.offersBuying.click();
        Thread.sleep(2000);
    }

    @And("I click pending")
    public void IClickPending() throws InterruptedException {
        objProfile.pendingBuying.click();
        Thread.sleep(2000);
    }

    @And("I click in progress")
    public void IClickInProgress() throws InterruptedException {
        objProfile.inProgressBuying.click();
        Thread.sleep(2000);
    }

    @And("I click history buying")
    public void IClickHistoryBuying() throws InterruptedException {
        objProfile.historyBuying.click();
        Thread.sleep(2000);
    }

    @Then("I use buying successfully")
    public void IUseBuyingSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("I want to use selling")
    public void IWantToUseSelling() {

    }

    @And("I click selling")
    public void IClickSelling() {

    }

    @And("I use selling successfully")
    public void IUseSellingSuccessfully() {

    }

    @When("I want to use my voucher")
    public void IWantToUseMyVoucher() {

    }

    @And("I click my voucher")
    public void IClickMyVoucher() {
        objProfile.myVoucherButton.click();
    }

    @And("I click history my voucher")
    public void IClickHistoryMyVoucher() {
        objProfile.historyMyVoucher.click();
    }

    @And("I click active my voucher")
    public void IClickActiveMyVoucher() {
        objProfile.activeMyVoucher.click();
    }

    @And("I select my voucher code")
    public void ISelectMyVoucherCode() {
        objProfile.selectMyVoucher.click();
    }

    @And("I click copy my voucher code")
    public void IClickCopyMyVoucherCode() {
        objProfile.copySelectedMyVoucher.click();
    }

    @Then("I use my voucher successfully")
    public void IUseMyVoucherSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("I want to use wishlist")
    public void IWantToUseWishlist() {

    }

    @And("I click wishlist")
    public void IClickWishlist() throws InterruptedException {
        objProfile.wishlistButton.click();
        Thread.sleep(2000);
    }

    @And("I click street wear wishlist")
    public void IClickStreetWearWishlist() throws InterruptedException {
        objProfile.streetWearWishlist.click();
        Thread.sleep(2000);
    }

    @And("I click luxury wishlist")
    public void IClickLuxuryWishlist() throws InterruptedException {
        objProfile.luxuryWishlist.click();
        Thread.sleep(2000);
    }

    @And("I click lifestyle wishlist")
    public void IClickLifestyleWishlist() throws InterruptedException {
        objProfile.lifeStyleWishlist.click();
        Thread.sleep(2000);
    }

    @And("I click sneakers wishlist")
    public void IClickSneakersWishlist() {
        objProfile.sneakersWishlist.click();
    }

    @Then("I use wishlist successfully")
    public void IUseWishlistSuccessfullt() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("I want to use help center")
    public void IWantToUseHelpCenter() {

    }

    @And("I click help center")
    public void IClickHelpCenter() throws InterruptedException {
        objProfile.helpCenterButton.click();
        Thread.sleep(3000);
    }

    @And("I click faq")
    public void IClickFaq() throws InterruptedException {
        objProfile.faq.click();
        scrollTouch(3);
        Thread.sleep(3000);
    }

    @And("I click panduan pembayaran")
    public void IClickPanduanPembayaran() {
        objProfile.panduanPembayaran.click();

    }

    @And("I click terms and conditions")
    public void IClickTermsAndConditions() {
        objProfile.termsAndConditions.click();
    }

    @And("I click  privacy policy")
    public void IClickPrivacyPolicy() {
        objProfile.privacyPolicy.click();

    }

    @And("I click contact us")
    public void IClickContactUs() {
        objProfile.contactUs.click();
    }

    @Then("I use help center successfully")
    public void IUseHelpCenterSuccessfully() {

    }

    @When("I want to use profile settings")
    public void IWantToUseProfileSettings() {

    }

    @And("I click profile settings")
    public void IClickProfileSettings() throws InterruptedException {
        objProfile.profileSettings.click();
        Thread.sleep(2000);
    }

    @And("I click edit personal profile")
    public void IClickEditPersonalProfile() throws InterruptedException {
        objProfile.personalProfile.click();
        Thread.sleep(2000);
        objProfile.goBackButton.click();
    }

    @And("I click edit shipping info")
    public void IClickEditShippingInfo() throws InterruptedException {
        objProfile.shippingInfo.click();
        Thread.sleep(2000);
        objProfile.goBackButton.click();

    }

    @And("I click edit user location")
    public void IClickEditUserLocation() throws InterruptedException {
        objProfile.userLocation.click();
        Thread.sleep(2000);
        objProfile.goBackButton.click();

    }

    @And("I click edit payout info")
    public void IClickEditPayoutInfo() throws InterruptedException {
        objProfile.payoutInfo.click();
        Thread.sleep(2000);
        objProfile.goBackButton.click();

    }

    @And("I click edit notification references")
    public void IClickEditNotificationReferences() throws InterruptedException {
        objProfile.notificationPreferences.click();
        Thread.sleep(2000);
        objProfile.goBackButton.click();

    }

    @Then("I use profile settings successfully")
    public void IUseProfileSettingsSuccessfully() throws InterruptedException {
        Thread.sleep(3000);

    }

    @When("I want to use change password")
    public void IWantToUseChangePassword() {

    }

    @And("I click change password")
    public void IClickChangePassword() {
        objProfile.changePasswordButton.click();
    }

    @And("I input old password {string}")
    public void IInputOldPassword(String oldPassword) {
        objProfile.oldPassword.sendKeys(oldPassword);
    }

    @And("I input new password {string}")
    public void IInputNewPassword(String newPassword) {
        objProfile.newPassword.sendKeys(newPassword);
    }

    @And("I input confirm new password {string}")
    public void IInputConfirmNewPassword(String confirmPassword) {
        objProfile.confirmPassword.sendKeys(confirmPassword);
    }

    @And("I click save changes")
    public void IClickSaveChanges() {
        objProfile.saveChangesPassword.click();
    }

    @Then("I use change password successfully")
    public void IUseChangePasswordSuccessfully() throws InterruptedException {
    Thread.sleep(3000);
    }


}
