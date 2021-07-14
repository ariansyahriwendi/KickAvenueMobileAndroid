package Object.Market;

import Object.AbstractObject.AbstractObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Market extends AbstractObject {
    public Market(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc='market_tab']")
    public AndroidElement marketTab;

    @AndroidFindBy(xpath = "//*[@content-desc='search-input']")
    public AndroidElement searchMarketInput;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-search']")
    public AndroidElement filterMarketSearch;

    @AndroidFindBy(xpath = "//*[@content-desc='search-sneakers']")
    public AndroidElement searchMarketSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='search-streetwear']")
    public AndroidElement searchMarketStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='search-luxury']")
    public AndroidElement searchMarketLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='search-lifestyle']")
    public AndroidElement searchMarketLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-sneakers']")
    public AndroidElement filterSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-streetwear']")
    public AndroidElement filterStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-luxury']")
    public AndroidElement filterLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='search-lifestyles']")
    public AndroidElement searchMarketLifeStyle;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-lifestyles']")
    public AndroidElement filterLifeStyle;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-nike']")
    public AndroidElement popularBrandNike;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-adidas']")
    public AndroidElement popularBrandAdidas;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-jordan']")
    public AndroidElement popularBrandJordan;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-yeezy']")
    public AndroidElement popularBrandYeezy;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-new-balance']")
    public AndroidElement popularBrandNewBalance;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-converse']")
    public AndroidElement popularBrandConverse;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-vans']")
    public AndroidElement popularBrandVans;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-puma']")
    public AndroidElement popularBrandPuma;

    @AndroidFindBy(xpath = "//*[@content-desc='by-gender-men']")
    public AndroidElement byGenderMen;

    @AndroidFindBy(xpath = "//*[@content-desc='by-gender-women']")
    public AndroidElement byGenderWomen;

    @AndroidFindBy(xpath = "//*[@content-desc='by-gender-youth-/-kids']")
    public AndroidElement byGenderYouthKid;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-bathing-ape']")
    public AndroidElement popularBrandBathingApe;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-champion']")
    public AndroidElement popularBrandChampion;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-off-white']")
    public AndroidElement popularBrandOffWhite;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-supreme']")
    public AndroidElement popularBrandSupreme;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-dior']")
    public AndroidElement popularBrandDior;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-louis-vuitton']")
    public AndroidElement popularBrandLouisVuitton;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-balenciaga']")
    public AndroidElement popularBrandBalenciaga;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-gucci']")
    public AndroidElement popularBrandGucci;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-hermès']")
    public AndroidElement popularBrandHermes;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-coach-']")
    public AndroidElement popularBrandCoach;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-tory-burch']")
    public AndroidElement popularBrandToryBurch;

    @AndroidFindBy(xpath = "//*[@content-desc='popular-brand-michael-kors-handbags']")
    public AndroidElement popularBrandMichaelKorsHandbags;

    @AndroidFindBy(xpath = "//*[@content-desc='category-bike']")
    public AndroidElement categoryBike;

    @AndroidFindBy(xpath = "//*[@content-desc='category-games-&-consoles']")
    public AndroidElement categoryGamesConsole;

    @AndroidFindBy(xpath = "//*[@content-desc='category-collectibles']")
    public AndroidElement categoryCollectibles;

    @AndroidFindBy(xpath = "//*[@content-desc='search-found-in-sneakers']")
    public AndroidElement resultFoundSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='apply-filter']")
    public AndroidElement applyFilter;

    @AndroidFindBy(xpath = "//*[@content-desc='sort-by-MOST POPULAR']")
    public AndroidElement sortByMostPopular;

    @AndroidFindBy(xpath = "//*[@content-desc='sort-by-BEST MATCH']")
    public AndroidElement sortByBestMatch;

    @AndroidFindBy(xpath = "//*[@content-desc='sort-by-PRICE (HIGH - LOW)']")
    public AndroidElement sortByHighLow;

    @AndroidFindBy(xpath = "//*[@content-desc='gender-MEN']")
    public AndroidElement genderMen;

    @AndroidFindBy(xpath = "//*[@content-desc='gender-WOMEN']")
    public AndroidElement genderWomen;

    @AndroidFindBy(xpath = "//*[@content-desc='gender-YOUTH / KIDS']")
    public AndroidElement genderYouthKid;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-NEW']")
    public AndroidElement conditionNew;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-USED']")
    public AndroidElement conditionUsed;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-PRE-ORDER']")
    public AndroidElement conditionPreOrder;

    @AndroidFindBy(xpath = "//*[@content-desc='brand-Adidas']")
    public AndroidElement brandAdidas;

    @AndroidFindBy(xpath = "//*[@content-desc='brand-ADIDAS STAN SMITH']")
    public AndroidElement brandAdidasStanSmith;

    @AndroidFindBy(xpath = "//*[@content-desc='color-Red']")
    public AndroidElement colorRed;

    @AndroidFindBy(xpath = "//*[@content-desc='color-Black']")
    public AndroidElement colorBlack;

    @AndroidFindBy(xpath = "//*[@content-desc='search-found-in-lifestyles']")
    public AndroidElement resultFoundLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='search-found-in-streetwear']")
    public AndroidElement resultFoundStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='search-found-in-luxury']")
    public AndroidElement resultFoundLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='sneakers']")
    public AndroidElement marketSneakers;

    @AndroidFindBy(xpath = "//*[@content-desc='streetwear']")
    public AndroidElement marketStreetwear;

    @AndroidFindBy(xpath = "//*[@content-desc='luxury']")
    public AndroidElement marketLuxury;

    @AndroidFindBy(xpath = "//*[@content-desc='lifestyle']")
    public AndroidElement marketLifestyle;

    @AndroidFindBy(xpath = "//*[@content-desc='open-filter-search']")
    public AndroidElement filter;

    @AndroidFindBy(xpath = "//*[@content-desc='back-to-search']")
    public AndroidElement backToSearch;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-BRAND NEW']")
    public AndroidElement conditionBrandNew;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-PRISTINE']")
    public AndroidElement conditionPristine;

    @AndroidFindBy(xpath = "//*[@content-desc='condition-GOOD']")
    public AndroidElement conditionGood;

    @AndroidFindBy(xpath = "//*[@content-desc='brand-Bike']")
    public AndroidElement filterCategoryBike;




}
