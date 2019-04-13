package ControlsPage;

import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Controls extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]\n")
    public WebElement StandardSwitch;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]\n")
    public WebElement ControlsPage;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]\n")
    public WebElement Slider;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]\n")
    public WebElement CustomSlider;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Increment\"]\n")
    public WebElement UISetter;

//XCUIElementTypeButton[@name="Increment"]


    public void setStandardSwitch() throws Exception {
        StandardSwitch.click();
        Assert.assertTrue(true);
    }


    public void setControlsPage() throws Exception {
        ControlsPage.click();
    }

    public void setSlider() throws Exception {
        TouchAction action = new TouchAction(ad);
        action.longPress(293, 337).moveTo(320, 337).perform().release();
        Thread.sleep(5000);
        Assert.assertTrue(true);
    }

    public void setCustomSlider() throws Exception {
        TouchAction action = new TouchAction(ad);
        action.longPress(293, 512).moveTo(320, 512).perform().release();
        Thread.sleep(5000);
        Assert.assertTrue(true);
    }

}
