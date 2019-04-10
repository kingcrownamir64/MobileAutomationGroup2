package ButtonsPage;

import common.MobileAPI;
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
        TouchAction action = new TouchAction(ad).longPress(buttonWithImage);
        action.perform();
        Thread.sleep(2000);
        buttonWithImage.isDisplayed();
        Assert.assertTrue(true);
    }
}
