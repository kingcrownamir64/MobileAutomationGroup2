package AlertsPage;

import common.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Alerts extends MobileAPI {

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]\n")
    public WebElement ShowSimpleButton;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]\n")
    public WebElement ShowOkCancelButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]\n")
    public WebElement ShowCustomized;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]\n")
    public WebElement ShowSimple;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]\n")
    public WebElement SelectAlertsPage;


    public void setSelectAlertsPage() throws Exception {
        SelectAlertsPage.click();
        Assert.assertTrue(true);
    }

    public void setShowSimpleButton() throws Exception {
        ShowSimpleButton.click();
        Assert.assertTrue(true);
    }

    public void setShowOkCancelButton() throws Exception {
        ShowOkCancelButton.click();
        Assert.assertTrue(true);
    }

    public void setShowCustomized() throws Exception {
        ShowCustomized.click();
        Assert.assertTrue(true);
    }

    public void setShowSimple() throws Exception {
        ShowSimple.click();
        Assert.assertTrue(true);
    }
}
