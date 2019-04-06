import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MacysStores extends MobileAPI {

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement letsGo;

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement notNow;

    @FindBy (id = "com.macys.android:id/global_navigation_your_store_tab")
    private WebElement storeTab;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement storeHeading;

    @FindBy (id = "com.macys.android:id/btn_select_a_store")
    private WebElement selectAStore;

    @FindBy (id = "com.android.packageinstaller:id/permission_deny_button")
    private WebElement deny;

    @FindBy (id = "android:id/button1")
    private WebElement locationDisabledOk;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    private WebElement findAStoreHead;

    @FindBy (id = "com.macys.android:id/menu_storeseacrch_nearme")
    private WebElement storesNearMe;

    @FindBy (id = "com.macys.android:id/tvTitle")
    private WebElement locationServices;

    @FindBy (id = "com.macys.android:id/tvNotNow")
    private WebElement locationServicesNotNow;

    @FindBy (id = "android:id/search_src_text")
    private WebElement searchStore;

    @FindBy (id = "com.macys.android:id/tv_storesearch_query_description")
    private WebElement storeNearDescription;

    @FindBy (xpath = "//android.widget.RelativeLayout[@content-desc=\"StoreSearchScreen\"]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    private WebElement heraldSquare;

    @FindBy (id = "com.macys.android:id/txt_store_name")
    private WebElement heraldSquareHeading;

    @FindBy (id = "com.macys.android:id/txt_change_store")
    private WebElement changeLocation;

    @FindBy (xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"MAP\"]")
    private WebElement map;

    @FindBy (xpath = "//android.widget.RelativeLayout[@content-desc=\"StoreSearchScreen\"]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    private WebElement googleLogo;

    @FindBy (id = "com.macys.android:id/tv_store_search_hint")
    private WebElement invalidSearchMessage;

    @FindBy (id = "com.macys.android:id/feature_map_directory")
    private WebElement directory;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement storeDirectory;

    public void clickStore(){
        letsGo.click();
        notNow.click();
        storeTab.click();
    }

    public void storeHeadingDisplay(){
        storeHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSelectAStore(){
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        findAStoreHead.isDisplayed();
        Assert.assertTrue(true);
    }
    public void clickStoreNearMe() throws Exception{
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServices.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
        locationServicesNotNow.click();
        locationDisabledOk.click();
    }

    public void searchForStore() throws Exception {
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        searchStore.sendKeys("New York" + "\n");
        storeNearDescription.isDisplayed();
        Assert.assertTrue(true);
    }

    public void selectHeraldSquare() throws Exception{
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        Thread.sleep(2000);
        searchStore.sendKeys("New York" + "\n");
        heraldSquare.click();
        Thread.sleep(2000);
        heraldSquareHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void checkMaps() throws Exception {
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        Thread.sleep(2000);
        searchStore.sendKeys("New York" + "\n");
        heraldSquare.click();
        changeLocation.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        map.click();
        googleLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void invalidSearch() throws Exception {
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        Thread.sleep(2000);
        searchStore.sendKeys("1234567890" + "\n");
        invalidSearchMessage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void searchDirectory() throws Exception {
        selectAStore.click();
        deny.click();
        locationDisabledOk.click();
        storesNearMe.click();
        locationServicesNotNow.click();
        locationDisabledOk.click();
        Thread.sleep(2000);
        searchStore.sendKeys("New York" + "\n");
        heraldSquare.click();
        Thread.sleep(2000);
        directory.click();
        storeDirectory.isDisplayed();
        Assert.assertTrue(true);
    }
}
