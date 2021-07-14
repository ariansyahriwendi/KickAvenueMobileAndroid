package Object.Sell;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Sell extends AbstractObject {
    public Sell(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='sell_tab']")
    public AndroidElement sellTab;

    @AndroidFindBy(xpath = "//*[@content-desc='select-sell-request-sneakers']")
    public AndroidElement sellSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][1]")
    public AndroidElement image1;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][2]")
    public AndroidElement image2;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][3]")
    public AndroidElement image3;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][4]")
    public AndroidElement image4;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][5]")
    public AndroidElement image5;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][6]")
    public AndroidElement image6;

    @AndroidFindBy(xpath = "//*[@content-desc='next-button']")
    public AndroidElement nextButton;

    @AndroidFindBy(xpath = "//*[@content-desc='select-button-sneakers']")
    public AndroidElement selectCategorySneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='open-product-list-search']")
    public AndroidElement inputProduct;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-search-txt-input']")
    public AndroidElement inputProductField;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-adidas-nmd-r1-jd-sports-grey']")
    public AndroidElement productSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='product-size-(us)-select']")
    public AndroidElement sizeField;

    @AndroidFindBy(xpath = "//*[@content-desc='select-size-8']")
    public AndroidElement selectSize8;

    @AndroidFindBy(xpath = "//*[@content-desc='product-sneakers-condition-select']")
    public AndroidElement sneakersCondition;

    @AndroidFindBy(xpath = "//*[@content-desc='select-product-condition-brand-new']")
    public AndroidElement sneakersConditionNew;

    @AndroidFindBy(xpath = "//*[@content-desc='product-box-condition-select']")
    public AndroidElement boxCondition;

    @AndroidFindBy(xpath = "//*[@content-desc='select-box-condition-perfect']")
    public AndroidElement boxConditionPerfect;

    @AndroidFindBy(xpath = "//*[@content-desc='selling-price-txt-input']")
    public AndroidElement inputPrice;

    @AndroidFindBy(xpath = "//*[@content-desc='Back']")
    public AndroidElement back;

    @AndroidFindBy(xpath = "//*[@content-desc='submit']")
    public AndroidElement submit;

    @AndroidFindBy(xpath = "//*[@content-desc='select-sell-request-streetwear']")
    public AndroidElement sellStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='select-button-streetwear']")
    public AndroidElement selectCategoryStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-supreme-blocked-hoodie-yellow']")
    public AndroidElement productStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='select-size-All Size']")
    public AndroidElement selectSizeAllSize;


    @AndroidFindBy(xpath = "//*[@content-desc='select-product-condition-brand-new']")
    public AndroidElement streetwearConditionBrandNew;

    @AndroidFindBy(xpath = "//*[@content-desc='product-select-condition-select']")
    public AndroidElement selectProductCondition;

    @AndroidFindBy(xpath = "//*[@content-desc='product-select-size-select']")
    public AndroidElement sizeFieldStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='select-sell-request-luxury']")
    public AndroidElement sellLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='select-sell-request-lifestyle']")
    public AndroidElement sellLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='select-button-luxury']")
    public AndroidElement selectCategoryLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-gg-marmont-bifold-wallet-']")
    public AndroidElement productLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='product-product-condition-select']")
    public AndroidElement selectLuxuryCondition;

    @AndroidFindBy(xpath = "//*[@content-desc='select-button-lifestyle']")
    public AndroidElement selectCategoryLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='product-list-united-black-horse-bike-']")
    public AndroidElement productLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='product-select-size-select']")
    public AndroidElement sizeFieldLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='select-box-condition-missing-box']")
    public AndroidElement missingBox;

    @AndroidFindBy(xpath = "//*[@content-desc='select-box-condition-perfect']")
    public AndroidElement perfectBox;

//    @AndroidFindBy(xpath = "")
//    public AndroidElement
//
//    @AndroidFindBy(xpath = "")
//    public AndroidElement









}
