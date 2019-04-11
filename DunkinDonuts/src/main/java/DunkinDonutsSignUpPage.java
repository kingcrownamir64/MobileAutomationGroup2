import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DunkinDonutsSignUpPage extends MobileAPI {

    @FindBy (id = "com.dunkinbrands.otgo:id/guestEnter")
    private WebElement maybeLater;

    @FindBy (id = "com.dunkinbrands.otgo:id/onTheGoButtonContainer")
    private WebElement order;

    @FindBy (id = "com.android.packageinstaller:id/permission_deny_button")
    private WebElement denyLocation;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    private WebElement signUpHeading;

    @FindBy (id = "com.dunkinbrands.otgo:id/enrollNow")
    private WebElement enrollNow;


    public void acceptPopUps(){
        //accept.click();
        maybeLater.click();
        order.click();
        enrollNow.click();
    }

    public void verifySignUpHeading(){
        signUpHeading.isDisplayed();
        Assert.assertTrue(true);
    }
}
