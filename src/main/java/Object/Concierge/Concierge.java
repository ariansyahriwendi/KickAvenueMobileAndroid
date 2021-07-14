package Object.Concierge;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Concierge extends AbstractObject {
    public Concierge(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='luxury-concierge-service-button']")
    public AndroidElement conciergeServiceButton;

    @AndroidFindBy(xpath = "//*[@content-desc='home_tab']")
    public AndroidElement homeTab;

    @AndroidFindBy(xpath = "//*[@content-desc='tab-2']")
    public AndroidElement homeLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='see-my-concierge-button']")
    public AndroidElement seeMyConciergeList;

    @AndroidFindBy(xpath = "//*[@content-desc='go-back-button']")
    public AndroidElement back;

    @AndroidFindBy(xpath = "//*[@text='Enter Your Name']")
    public AndroidElement nameField;

    @AndroidFindBy(xpath = "//*[@content-desc='phone-number-input']")
    public AndroidElement phoneNumberField;

    @AndroidFindBy(xpath = "//*[@text='Enter Product Name']")
    public AndroidElement productNameField;

    @AndroidFindBy(xpath = "//*[@content-desc='brand-new-button']")
    public AndroidElement brandNewButton;

    @AndroidFindBy(xpath = "//*[@content-desc='used-button']")
    public AndroidElement usedButton;

    @AndroidFindBy(xpath = "//*[@content-desc='select-image-button']")
    public AndroidElement selectImageButton;

    @AndroidFindBy(xpath = "//*[@content-desc='select-gallery-button']")
    public AndroidElement selectGallery;

    @AndroidFindBy(xpath = "//*[@content-desc='gallery-image-[object Object]'][1]")
    public AndroidElement selectImage1;

    @AndroidFindBy(xpath = "//*[@content-desc='submit-concierge-button']")
    public AndroidElement submitConciergeButton;

    @AndroidFindBy(xpath = "//*[@content-desc='close-modal-button']")
    public AndroidElement closeConcierge;

//    @AndroidFindBy(xpath = "")
//    public AndroidElement ;
//
//    @AndroidFindBy(xpath = "")
//    public AndroidElement ;




}
