package ToolbarPage;

import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

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



    public void setToolBarPageButton() throws Exception {
        ToolBarPage.click();
    }

    public void setImageButton() throws Exception {
        ImageButton.click();
    }

    public void setTintedButton() throws Exception {
        TintedButton.click();
    }

    public void setDefaultButton() throws Exception {
        DefaultButton.click();
    }

    public void setBlackButton() throws Exception {
        BlackButton.click();
    }

    public void setTranslucentButton() throws Exception {
        TranslucentButton.click();
    }

    public void setItem1Button() throws Exception {
        Item1Button.click();
    }

    public void setItem2Button() throws Exception {
        Item2Button.click();
    }

    public void setSettingButton() throws Exception {
        SettingButton.click();
    }

}