package Object.Checkout;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Checkout extends AbstractObject {
    public Checkout(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-adidas-nmd-r1-jd-sports-grey']")
    public AndroidElement productSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-supreme-blocked-hoodie-yellow']")
    public AndroidElement productStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-gg-marmont-bifold-wallet']")
    public AndroidElement productLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-united-black-horse-bike']")
    public AndroidElement productLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='button-new']")
    public AndroidElement buttonNew;

    @AndroidFindBy(xpath = "//*[@content-desc='button-brand-new']")
    public AndroidElement selectSize;

    @AndroidFindBy(xpath = "//*[@content-desc='pick-payment-method']")
    public AndroidElement pickPaymentMethod;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_kickcredit']")
    public AndroidElement selectPaymentKickCredit;

    @AndroidFindBy(xpath = "//*[@content-desc='button-view-detail-price']")
    public AndroidElement viewDetailPrice;

    @AndroidFindBy(xpath = "//*[@content-desc='button-close-price-detail']")
    public AndroidElement closePriceDetail;

    @AndroidFindBy(xpath = "//*[@content-desc='place-order']")
    public AndroidElement placeOrder;

    @AndroidFindBy(xpath = "//*[@content-desc='button-view-order-history']")
    public AndroidElement viewOrderHistory;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_installment_bca_installments']")
    public AndroidElement selectPaymentBCAInstallments;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_installment_bca_credit_card']")
    public AndroidElement selectPaymentBCACreditCard;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_installment_mandiri_credit_card']")
    public AndroidElement selectPaymentMandiriInstallments;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_installment_credit_card']")
    public AndroidElement selectPaymentCreditCard;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_bca_va']")
    public AndroidElement selectPaymentVirtualAccountBCA;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_mandiri_va']")
    public AndroidElement selectPatmentVirtualAccountMandiri;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_permata_va']")
    public AndroidElement selectPaymentVirtualAccountPermata;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_bni_va']")
    public AndroidElement selectPaymentVirtualAccountBNI;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_bri_va']")
    public AndroidElement selectPaymentVirtualAccountBRI;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_gopay']")
    public AndroidElement selectPaymentVirtualAccountGopay;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_va_virtual_account']")
    public AndroidElement selectPaymentVirtualAccountOther;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_online_installment_atome']")
    public AndroidElement selectPaymentOnlineInstallmentAtome;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_online_installment_kredivo']")
    public AndroidElement selectPaymentOnlineInstallmentKredivo;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_online_installment_akulaku']")
    public AndroidElement selectPaymentOnlineInstallmentAkulaku;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_bank_transfer_bank_transfer/0']")
    public AndroidElement selectPaymentBankTransferBCA;

    @AndroidFindBy(xpath = "//*[@content-desc='selectpayment_bank_transfer_bank_transfer/1']")
    public AndroidElement selectPaymentBankTransferMandiri;

    @AndroidFindBy(xpath = "//*[@content-desc='button-select-atome-payment']")
    public AndroidElement chooseTenure;

    @AndroidFindBy(xpath = "//*[@content-desc='button-select-kredivo-bayar-dalam-30-hari']")
    public AndroidElement chooseTenureKredivo30Hari;

    @AndroidFindBy(xpath = "//*[@content-desc='button-make-offer']")
    public AndroidElement makeOfferButton;

    @AndroidFindBy(xpath = "//*[@content-desc='make-offer-price-field']")
    public AndroidElement makeOfferPrice;

    @AndroidFindBy(xpath = "//*[@content-desc='place-offer']")
    public AndroidElement placeOffer;

    @AndroidFindBy(xpath = "//*[@content-desc='view-offer-history-button']")
    public AndroidElement viewOfferHistory;

//    @AndroidFindBy(xpath = "")
//    public AndroidElement
//
//    @AndroidFindBy(xpath = "")
//    public AndroidElement
//
//    @AndroidFindBy(xpath = "")
//    public AndroidElement
//
//    @AndroidFindBy(xpath = "")
//    public AndroidElement

}
