package Object.Profile;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Profile extends AbstractObject {
    public Profile(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='notif-history']")
    public AndroidElement notificationButton;

    @AndroidFindBy(xpath = "//*[@contentDescription='kick-credit-button']")
    public AndroidElement kickCreditButton;

    @AndroidFindBy(xpath = "//*[@contentDescription='pending-top-up']")
    public AndroidElement pendingTopUp;

    @AndroidFindBy(xpath = "//*[@contentDescription='pending-cash-out']")
    public AndroidElement pendingCashOut;

    @AndroidFindBy(xpath = "//*[@content-desc='wallet-logs']")
    public AndroidElement walletLogs;

    @AndroidFindBy(xpath = "//*[@content-desc='topup-kick-credit']")
    public AndroidElement topUpButton;

    @AndroidFindBy(xpath = "//*[@content-desc='topup-amount']")
    public AndroidElement topUpAmountField;

    @AndroidFindBy(xpath = "//*[@content-desc='continue']")
    public AndroidElement continueButton;

    @AndroidFindBy(xpath = "//*[@content-desc='bca']")
    public AndroidElement topUpBca;

    @AndroidFindBy(xpath = "//*[@content-desc='cashout-kick-credit']")
    public AndroidElement cashOutButton;

    @AndroidFindBy(xpath = "//*[@content-desc='cashout-amount']")
    public AndroidElement cashOutAmountField;

    @AndroidFindBy(xpath = "//*[@content-desc='seller-credit-button']")
    public AndroidElement sellerCreditButton;

    @AndroidFindBy(xpath = "//*[@content-desc='credit-info-button']")
    public AndroidElement sellerCreditInfoButton;

    @AndroidFindBy(xpath = "//*[@content-desc='kickpoint-button']")
    public AndroidElement kickRewardButton;

    @AndroidFindBy(xpath = "//*[@content-desc='right-button']")
    public AndroidElement historyKickRewardButton;

    @AndroidFindBy(xpath = "//*[@content-desc='continue-your-payment']")
    public AndroidElement continueYourPayment;

    @AndroidFindBy(xpath = "//*[@content-desc='confirm-cash-out']")
    public AndroidElement confirmCashOut;

    @AndroidFindBy(xpath = "//*[@content-desc='insert-password']")
    public AndroidElement inputPasswordCashOut;

    @AndroidFindBy(xpath = "//*[@content-desc='submit']")
    public AndroidElement submitCashOut;

    @AndroidFindBy(xpath = "//*[@content-desc='invite-a-friend']")
    public AndroidElement inviteAFriendButton;

    @AndroidFindBy(xpath = "//*[@content-desc='copy-referral-code']")
    public AndroidElement copyReferralCode;

    @AndroidFindBy(xpath = "//*[@content-desc='how-to-use']")
    public AndroidElement howToUseInviteAFriend;

    @AndroidFindBy(xpath = "//*[@content-desc='go-back-button']")
    public AndroidElement goBackButton;

    @AndroidFindBy(xpath = "//*[@content-desc='invite-a-friend']")
    public AndroidElement inviteAFriend;

    @AndroidFindBy(xpath = "//*[@content-desc='buying']")
    public AndroidElement buyingButton;

    @AndroidFindBy(xpath = "//*[@content-desc='offers']")
    public AndroidElement offersBuying;

    @AndroidFindBy(xpath = "//*[@content-desc='pending']")
    public AndroidElement pendingBuying;

    @AndroidFindBy(xpath = "//*[@content-desc='in-progress']")
    public AndroidElement inProgressBuying;

    @AndroidFindBy(xpath = "//*[@content-desc='history']")
    public AndroidElement historyBuying;

    @AndroidFindBy(xpath = "//*[@content-desc='my-voucher']")
    public AndroidElement myVoucherButton;

    @AndroidFindBy(xpath = "//*[@content-desc='history']")
    public AndroidElement historyMyVoucher;

    @AndroidFindBy(xpath = "//*[@content-desc='active']")
    public AndroidElement activeMyVoucher;

    @AndroidFindBy(xpath = "//*[@content-desc='select-TESTVOUCHER700K']")
    public AndroidElement selectMyVoucher;

    @AndroidFindBy(xpath = "//*[@content-desc='copy-TESTVOUCHER700K']")
    public AndroidElement copySelectedMyVoucher;

    @AndroidFindBy(xpath = "//*[@content-desc='wishlist']")
    public AndroidElement wishlistButton;

    @AndroidFindBy(xpath = "//*[@content-desc='sneakers-wishlist']")
    public AndroidElement sneakersWishlist;

    @AndroidFindBy(xpath = "//*[@content-desc='streetwear-wishlist']")
    public AndroidElement streetWearWishlist;

    @AndroidFindBy(xpath = "//*[@content-desc='luxury-wishlist']")
    public AndroidElement luxuryWishlist;

    @AndroidFindBy(xpath = "//*[@content-desc='lifestyle-wishlist']")
    public AndroidElement lifeStyleWishlist;

    @AndroidFindBy(xpath = "//*[@content-desc='help-center']")
    public AndroidElement helpCenterButton;

    @AndroidFindBy(xpath = "//*[@content-desc='faq']")
    public AndroidElement faq;

    @AndroidFindBy(xpath = "//*[@content-desc='panduan-pembayaran']")
    public AndroidElement panduanPembayaran;

    @AndroidFindBy(xpath = "//*[@content-desc='terms-&-conditions']")
    public AndroidElement termsAndConditions;

    @AndroidFindBy(xpath = "//*[@content-desc='privacy-policy']")
    public AndroidElement privacyPolicy;

    @AndroidFindBy(xpath = "//*[@content-desc='contact-us']")
    public AndroidElement contactUs;

    @AndroidFindBy(xpath = "//*[@content-desc='profile-settings']")
    public AndroidElement profileSettings;

    @AndroidFindBy(xpath = "//*[@content-desc='edit-personal-profile']")
    public AndroidElement personalProfile;

    @AndroidFindBy(xpath = "//*[@content-desc='edit-shipping-info']")
    public AndroidElement shippingInfo;

    @AndroidFindBy(xpath = "//*[@content-desc='edit-user-location']")
    public AndroidElement userLocation;

    @AndroidFindBy(xpath = "//*[@content-desc='edit-payout-info']")
    public AndroidElement payoutInfo;

    @AndroidFindBy(xpath = "//*[@content-desc='edit-notification-preferences']")
    public AndroidElement notificationPreferences;

    @AndroidFindBy(xpath = "//*[@content-desc='change-password']")
    public AndroidElement changePasswordButton;

    @AndroidFindBy(xpath = "//*[@content-desc='old-password']")
    public AndroidElement oldPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='new-password']")
    public AndroidElement newPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='confirm-password']")
    public AndroidElement confirmPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='save-changes']")
    public AndroidElement saveChangesPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='right-button']")
    public AndroidElement addSelling;

    @AndroidFindBy(xpath = "//*[@content-desc='toggle-switch']")
    public AndroidElement holidayMode;

    @AndroidFindBy(xpath = "//*[@content-desc='current-tab']")
    public AndroidElement currentSell;

    @AndroidFindBy(xpath = "//*[@content-desc='in-progress-tab']")
    public AndroidElement inProgressSell;

    @AndroidFindBy(xpath = "//*[@content-desc='history-tab']")
    public AndroidElement historySell;

    @AndroidFindBy(xpath = "//*[@content-desc='close-sell-request-category']")
    public AndroidElement closeSellRequest;

    @AndroidFindBy(xpath = "//*[@content-desc='selling']")
    public AndroidElement sellingButton;

    @AndroidFindBy(xpath = "//*[@content-desc='wishlist-size-8']")
    public AndroidElement size8;

    @AndroidFindBy(xpath = "//*[@content-desc='wishlist-submit']")
    public AndroidElement saveWishlist;

    @AndroidFindBy(xpath = "//*[@content-desc='button-wishlist']")
    public AndroidElement wishlistProductButton;


}
