package WebPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Web extends MobileAPI{

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]")
    private WebElement web;

    @FindBy (xpath = "//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]\n")
    private WebElement appleLogo;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Shopping Bag\"]")
    private WebElement shoppingBag;

    @FindBy (xpath = "//XCUIElementTypeOther[@name=\"navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther[5]")
    private WebElement signIn;

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Sign in for faster checkout.\"]")
    private WebElement signInHeading;

    @FindBy (xpath = "//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private WebElement buttonBurger;

    @FindBy (xpath = "//XCUIElementTypeLink[@name=\"Buy now with trade in\"]")
    private WebElement buyIphoneXr;

    @FindBy (xpath = "//XCUIElementTypeOther[@name=\"Global Navigation, navigation\"]/XCUIElementTypeOther")
    private WebElement iPhoneXrHeading;

    public void clickWeb(){
        web.click();
    }

    public void verifyAppleLogo(){
        appleLogo.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyShoppingBag(){
        shoppingBag.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyButtonBurger(){
        buttonBurger.isDisplayed();
        Assert.assertTrue(true);
    }

    public void iPhoneXr(){
        buyIphoneXr.click();
    }
}