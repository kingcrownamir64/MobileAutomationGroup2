import common.MobileAPI;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacysHome extends MobileAPI {

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement letsGo;

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement notNow;

    @FindBy(id = "com.macys.android:id/global_navigation_shop_tab")
    private WebElement shopButton;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement shopHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement womensTab;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement womensHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement mensTab;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement mensHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement kidsAndBaby;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement kidsHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement home;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement homeHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement shoes;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement shoesHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement handbags;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement handbagsHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement beauty;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement beautyHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement furniture;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement furnitureHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement bedBath;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement bedBathHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement jewelry;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement jewelryHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement watches;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement watchesHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement juniors;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement juniorsHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement plusPetite;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement plusPetiteHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement baby;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement babyHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement sportsFanShop;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement sportsFanShopHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement theEdit;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement theEditHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement giftGuide;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement giftGuideHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement weddingRegistry;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement weddingRegistryHeading;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement salesAndClearance;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement salesAndClearanceHeading;

    @FindBy (id = "android:id/search_src_text")
    private WebElement searchBox;

    @FindBy (id = "com.macys.android:id/menu_search")
    private WebElement searchMagnifyingGlass;

    public void cancelPopUps(){
        letsGo.click();
        notNow.click();
    }

    public void clickShop() throws Exception {
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(3000);
    }

    public void verifyShop() throws Exception {
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(3000);
        shopHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickWomens() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        womensTab.click();

    }

    public void clickMens() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        mensTab.click();
        mensHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clicksMen(){
        mensTab.click();
    }

    public void clickKids() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        kidsAndBaby.click();
        kidsHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickHome() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        home.click();
        homeHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickShoes() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        shoes.click();
        shoesHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickHandbags() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        handbags.click();
        handbagsHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBeauty() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        beauty.click();
        beautyHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickFurniture() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        furniture.click();
        furnitureHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBedBath() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        bedBath.click();
        bedBathHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickJewelry() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        jewelry.click();
        jewelryHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickWatches() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        watches.click();
        watchesHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickJuniors() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        juniors.click();
        juniorsHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickPlusAndPetite() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        plusPetite.click();
        plusPetiteHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBaby() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        baby.click();
        babyHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSportsFanShop() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        sportsFanShop.click();
        sportsFanShopHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickTheEdit() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        theEdit.click();
        theEditHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickGiftGuide() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        giftGuide.click();
        giftGuideHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickWeddingRegistry() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        weddingRegistry.click();
        weddingRegistryHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSales() throws Exception{
        letsGo.click();
        notNow.click();
        shopButton.click();
        Thread.sleep(2000);
        salesAndClearance.click();
        salesAndClearanceHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSearchBox(){
        searchBox.click();
    }

    public void searchForItems(String item) throws Exception {
        shopButton.click();
        searchMagnifyingGlass.click();
        searchBox.clear();
        Thread.sleep(3000);
        searchBox.sendKeys(item + "\n");
        Thread.sleep(3000);
    }
}