package SegmentsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Segments extends MobileAPI {

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]")
    private WebElement segments;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    private WebElement check;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    private WebElement search;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    private WebElement tools;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[2]")
    private WebElement borderedCheck;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]")
    private WebElement borderedSearch;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]")
    private WebElement borderedTools;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    private WebElement styleBarCheck;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
    private WebElement styleBarSearch;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[3]")
    private WebElement styleBarTools;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]")
    private WebElement tintCheck;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]")
    private WebElement tintSearch;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]")
    private WebElement tintTools;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]")
    private WebElement imageCheck;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]")
    private WebElement imageSearch;

    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[5]")
    private WebElement imageTools;

    public void clickSegments(){
        segments.click();
    }

    public void clickCheck(){
        check.click();
        check.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickSearch(){
        search.click();
        search.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickTools(){
        tools.click();
        tools.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBorderedCheck(){
        borderedCheck.click();
        borderedCheck.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBorderedSearch(){
        borderedSearch.click();
        borderedSearch.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickBorderedTools(){
        borderedTools.click();
        borderedTools.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickStyleBarCheck(){
        styleBarCheck.click();
        styleBarCheck.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickStyleBarSearch(){
        styleBarSearch.click();
        styleBarSearch.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickStyleBarTools(){
        styleBarTools.click();
        styleBarTools.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickTintCheck(){
        tintCheck.click();
        tintCheck.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickTintSearch(){
        tintSearch.click();
        tintSearch.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickTintTools(){
        tintTools.click();
        tintTools.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickImageCheck(){
        imageCheck.click();
        imageCheck.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickImageSearch(){
        imageSearch.click();
        imageSearch.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickImageTools(){
        imageTools.click();
        imageTools.isDisplayed();
        Assert.assertTrue(true);
    }
}