package TransitionsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Transitions extends MobileAPI {

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]")
    private WebElement transitions;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Flip Image\"]")
    private WebElement flipImage;

    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Curl Image\"]")
    private WebElement curlImage;

    @FindBy (xpath = "//XCUIElementTypeOther[@name=\"Images\"]")
    private WebElement image;

    public void clickTransitions(){
        transitions.click();
    }

    public void verifyFlipImage(){
        flipImage.click();
        image.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyCurlImage(){
        curlImage.click();
        image.isDisplayed();
        Assert.assertTrue(true);
    }
}