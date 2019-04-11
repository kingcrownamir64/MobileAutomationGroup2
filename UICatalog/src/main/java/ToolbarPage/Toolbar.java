package ToolbarPage;

import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Toolbar extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Image\"]\n")
    public WebElement ImageButton;

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Tinted\"]\n")
    public WebElement TintedButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Default\"]\n")
    public WebElement DefaultButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Black\"]\n")
    public WebElement BlackButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Translucent\"]")
    public WebElement TranslucentButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item1\"]\n")
    public WebElement Item1Button;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item2\"]\n")
    public WebElement Item2Button;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Tools\"]\n")
    public WebElement SettingButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]\n")
    public WebElement ToolBarPage;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]\n")
    public WebElement BackButton;



    public void setToolBarPageButton() throws Exception {
        ToolBarPage.click();
        Assert.assertTrue(true);
    }

    public void setImageButton() throws Exception {
        ImageButton.click();
        Assert.assertTrue(true);
    }

    public void setTintedButton() throws Exception {
        TintedButton.click();
        Assert.assertTrue(true);
    }

    public void setDefaultButton() throws Exception {
        DefaultButton.click();
        Assert.assertTrue(true);
    }

    public void setBlackButton() throws Exception {
        BlackButton.click();
        Assert.assertTrue(true);
    }

    public void setTranslucentButton() throws Exception {
        TranslucentButton.click();
        Assert.assertTrue(true);
    }

    public void setItem1Button() throws Exception {
        Item1Button.click();
        Assert.assertTrue(true);
    }

    public void setItem2Button() throws Exception {
        Item2Button.click();
        Assert.assertTrue(true);
    }

    public void setSettingButton() throws Exception {
        SettingButton.click();
        Assert.assertTrue(true);
    }

    public void setBackbutton() throws Exception {
        BackButton.click();
        Assert.assertTrue(true);
    }

}