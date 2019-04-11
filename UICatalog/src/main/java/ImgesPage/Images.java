package ImgesPage;

import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Images extends MobileAPI {

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
    private WebElement images;

    @FindBy (xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")
    private WebElement dragDurationButton;

    public void clickImages(){
        images.click();
    }

    public void dragDuration() throws Exception{
        TouchAction action = new TouchAction(ad);
        action.longPress(190, 605).moveTo(250, 605).perform().release();
        Thread.sleep(5000);
        dragDurationButton.isDisplayed();
        Assert.assertTrue(true);
    }
}
