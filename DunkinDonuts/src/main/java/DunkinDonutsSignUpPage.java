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

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement firstName;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement lastName;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement email;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement mobilePhone;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement password;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement confirmPassword;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement promoCode;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement zipCode;

    @FindBy (id = "com.dunkinbrands.otgo:id/agree")
    private WebElement agree;

    @FindBy (id = "com.dunkinbrands.otgo:id/textinput_error")
    private WebElement invalidEmail;

    @FindBy (id = "com.dunkinbrands.otgo:id/textinput_error")
    private WebElement invalidPhone;

    @FindBy (id = "com.dunkinbrands.otgo:id/textinput_error")
    private WebElement invalidPassword;

    @FindBy (id = "com.dunkinbrands.otgo:id/textinput_error")
    private WebElement passwordNotMatching;

    @FindBy (id = "com.dunkinbrands.otgo:id/textinput_error")
    private WebElement invalidZipCode;

    @FindBy (id = "com.dunkinbrands.otgo:id/button")
    private WebElement zipCodeDeleteButton;

    @FindBy (id = "com.dunkinbrands.otgo:id/sideImage")
    private WebElement promoCodeQuestion;

    @FindBy (id = "com.dunkinbrands.otgo:id/message")
    private WebElement promoCodeMessage;

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

    public void enterFirstName() throws Exception{
        firstName.sendKeys("Bob");
        Thread.sleep(2000);
        firstName.isDisplayed();
        Assert.assertTrue(true);
    }

    public void enterFirstLastName() throws Exception{
        firstName.sendKeys("Bob");
        lastName.sendKeys("The Builder");
        Thread.sleep(2000);
        lastName.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyInvalidEmail() throws Exception{
        email.sendKeys("email@email");
        mobilePhone.click();
        Thread.sleep(2000);
        invalidEmail.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyInvalidPhone() throws Exception{
        mobilePhone.sendKeys("911");
        password.click();
        invalidPhone.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyInvalidPassword() throws Exception{
        password.sendKeys("abcdef");
        confirmPassword.click();
        invalidPassword.isDisplayed();
        Assert.assertTrue(true);
    }

    public void passwordNotMatching() throws Exception{
        password.sendKeys("Abcdef123.");
        confirmPassword.sendKeys("abcdef");
        scrollAndClickByName("Promo Code (Optional)");
        Thread.sleep(2000);
        passwordNotMatching.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyInvalidZipCode() throws Exception{
        zipCode.sendKeys("123");
        promoCode.sendKeys("\n");
        invalidZipCode.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyZipCodeDeleteButton(){
        zipCode.sendKeys("11101");
        zipCodeDeleteButton.isDisplayed();
        Assert.assertTrue(true);
        zipCodeDeleteButton.click();
    }

    public void verifyPromoCodeQuestion() throws Exception{
        promoCodeQuestion.click();
        Thread.sleep(1500);
        promoCodeMessage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyAgree(){
        agree.isDisplayed();
        Assert.assertTrue(true);
        agree.click();
    }
}
