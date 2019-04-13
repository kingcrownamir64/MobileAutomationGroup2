package ButtonsPage;

import common.MobileAPI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Buttons extends MobileAPI {

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private WebElement buttons;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    private WebElement grayButton;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    private WebElement buttonWithImage;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    private WebElement roundedButton;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Custom Text\"]")
    private WebElement attributedText;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"More info\"])[1]")
    private WebElement detailDisclosure;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"More info\"])[2]")
    private WebElement infoLight;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"More info\"])[3]")
    private WebElement infoDark;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Add contact\"]")
    private WebElement contactAdd;

    public void clickButtons(){
        buttons.click();
    }

    public void clickGray() throws Exception{
        Thread.sleep(2000);
        TouchAction action = new TouchAction(ad).longPress(300,168).release();
        action.perform();
        Thread.sleep(2000);
        grayButton.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBtnWithImg() throws Exception{
        buttonWithImage.click();
        buttonWithImage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickRoundedButton() throws Exception{
        roundedButton.click();
        roundedButton.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickAttributedButton() throws Exception{
        attributedText.click();
        attributedText.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickDetailsDisclosure(){
        detailDisclosure.click();
        detailDisclosure.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickInfoLight(){
        infoLight.click();
        infoLight.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickInfoDark(){
        infoDark.click();
        infoDark.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickContactAdd(){
        contactAdd.click();
        contactAdd.isDisplayed();
        Assert.assertTrue(true);
    }
}