import common.MobileAPI;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MacysCustomerService extends MobileAPI {

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement letsGo;

    @FindBy (id = "com.macys.android:id/btnSecond")
    private WebElement notNow;

    @FindBy (id = "com.macys.android:id/global_navigation_account_tab")
    private WebElement accountTab;

    @FindBy (id = "com.macys.android:id/account_screen_help")
    private WebElement getHelpAndShareFeedback;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement helpHeading;

    @FindBy (id = "com.macys.android:id/btn_change_password")
    private WebElement changeYourPassword;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement changeYourPwHeading;

    @FindBy (id = "com.macys.android:id/btn_make_payment")
    private WebElement makeAMacysCCPayment;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement makeAMacysCCPaymentHeading;

    @FindBy (id = "com.macys.android:id/btn_using_promo_codes")
    private WebElement usingPromoCodes;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement usingPromoCodesHeading;

    @FindBy (id = "com.macys.android:id/btn_tracking_your_order")
    private WebElement trackingYourOrder;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement trackingYourOrderHeading;

    @FindBy (id = "com.macys.android:id/btn_faq_number_5")
    private WebElement usingGooglePay;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement usingGooglePayHeading;

    @FindBy (id = "com.macys.android:id/btn_email")
    private WebElement emailButton;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement emailHeading;

    @FindBy (id = "com.macys.android:id/btn_feedback")
    private WebElement feedback;

    @FindBy (id = "com.macys.android:id/title")
    private WebElement messageBoxTitle;

    @FindBy (id = "com.macys.android:id/btn_call")
    private WebElement callButton;

    @FindBy (id = "com.macys.android:id/alertTitle")
    private WebElement callTitle;

    @FindBy (id = "android:id/button2")
    private WebElement callNoButton;

    @FindBy (id = "com.macys.android:id/btn_privacy")
    private WebElement privacyPractices;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement privacyPracticesHeading;

    public void clickCustomerService(){
        letsGo.click();
        notNow.click();
        accountTab.click();
        scrollAndClickByName("Get help & share feedback");
        //getHelpAndShareFeedback.click();
    }

    public void verifyHelpHeading(){
        helpHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyChangePassword() throws Exception{
        changeYourPassword.click();
        Thread.sleep(3000);
        changeYourPwHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyMakeCCPayment() throws Exception{
        makeAMacysCCPayment.click();
        Thread.sleep(3000);
        makeAMacysCCPaymentHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyUsingPromoCodes() throws Exception{
        usingPromoCodes.click();
        Thread.sleep(3000);
        usingPromoCodesHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyTrackingOrder() throws Exception{
        trackingYourOrder.click();
        Thread.sleep(3000);
        trackingYourOrderHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyUseGooglePay() throws Exception{
        usingGooglePay.click();
        Thread.sleep(3000);
        usingGooglePayHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyEmail() throws Exception{
        emailButton.click();
        Thread.sleep(3000);
        emailHeading.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyFeedback() throws Exception{
        scrollAndClickByName("Share your app ideas and experiences");
        Thread.sleep(3000);
        messageBoxTitle.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyCall() throws Exception{
        callButton.click();
        Thread.sleep(3000);
        callTitle.isDisplayed();
        Assert.assertTrue(true);
        callNoButton.click();
    }

    public void verifyPrivacyPractices() throws Exception{
        scrollAndClickByName("Privacy practices");
        Thread.sleep(3000);
        privacyPracticesHeading.isDisplayed();
        Assert.assertTrue(true);
    }
}
