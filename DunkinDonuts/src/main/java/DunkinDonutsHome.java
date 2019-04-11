import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DunkinDonutsHome extends MobileAPI {

    @FindBy (id = "com.dunkinbrands.otgo:id/right]")
    private WebElement accept;

    @FindBy (id = "com.dunkinbrands.otgo:id/guestEnter")
    private WebElement maybeLater;

    @FindBy (id = "com.dunkinbrands.otgo:id/perks_logo")
    private WebElement ddPerksLogo;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]")
    private WebElement ddButtonBurger;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ImageView")
    private WebElement btnBurgerLogo;

    @FindBy (id = "com.dunkinbrands.otgo:id/homeTileReload")
    private WebElement add;

    @FindBy (id = "com.dunkinbrands.otgo:id/text")
    private WebElement ddCardHeading;

    @FindBy (id = "com.dunkinbrands.otgo:id/homeTilePay")
    private WebElement scanPay;

    @FindBy (id = "com.dunkinbrands.otgo:id/onTheGoButtonContainer")
    private WebElement order;

    @FindBy (id = "com.dunkinbrands.otgo:id/homeTileOrder")
    private WebElement orderTile;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")
    private WebElement privacyAgreeBtn;

    @FindBy (id = "com.dunkinbrands.otgo:id/text")
    private WebElement orderHeading;

    @FindBy (id = "com.dunkinbrands.otgo:id/perks_banner_arrow")
    private WebElement joinDDPerks;

    @FindBy (id = "com.android.packageinstaller:id/permission_deny_button")
    private WebElement denyLocation;

    @FindBy (id = "com.dunkinbrands.otgo:id/signUpButton")
    private WebElement signUp;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    private WebElement signUpHeading;

    @FindBy (id = "com.dunkinbrands.otgo:id/add_dd_card")
    private WebElement addDDCard;

    @FindBy (id = "com.dunkinbrands.otgo:id/text")
    private WebElement headsUpHeading;

    public void acceptPopUps(){
        //accept.click();
        maybeLater.click();
    }

    public void verifyDDPerksLogo(){
        ddPerksLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyBtnBurgerLogo(){
        TouchAction action = new TouchAction(ad).longPress(143,2707).release();
        action.perform();
        //ddButtonBurger.click();
        btnBurgerLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyAdd(){
        add.click();
        ddCardHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyScanPay(){
        scanPay.click();
        ddCardHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyOrder(){
        order.click();
        orderHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyOrderTile(){
        orderTile.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyJoinDDPerks(){
        joinDDPerks.click();
        denyLocation.click();
    }

    public void verifyAddDDCard(){
        add.click();
        addDDCard.click();
        headsUpHeading.isDisplayed();
        Assert.assertTrue(true);
    }
}
