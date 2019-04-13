package iPhone;

import TextFieldsPage.TextFields;
import ToolbarPage.Toolbar;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolbarTest extends MobileAPI{


    Toolbar toolbar = new Toolbar();

    @BeforeMethod
    public void initialize() throws Exception {
        this.toolbar = PageFactory.initElements(this.ad, Toolbar.class);
        toolbar.setToolBarPageButton();
    }

    @Test(priority = 1)
    public void testImageButton() throws Exception {
        toolbar.setImageButton();
    }

    @Test(priority = 2)
    public void testTintedButton() throws Exception {
        toolbar.setTintedButton();
    }

    @Test(priority = 3)
    public void testDefaultButton() throws Exception {
        toolbar.setDefaultButton();
    }

    @Test(priority = 4)
    public void testBlackButton() throws Exception {
        toolbar.setBlackButton();
    }

    @Test(priority = 5)
    public void testTranslucentButton() throws Exception {
        toolbar.setTranslucentButton();
    }

    @Test(priority = 6)
    public void testItem1Button() throws Exception {
        toolbar.setItem1Button();
    }

    @Test(priority = 7)
    public void testItem2Button() throws Exception {
        toolbar.setItem2Button();
    }

    @Test(priority = 8)
    public void testSettingButton() throws Exception {
        toolbar.setSettingButton();
    }

    @Test(priority = 9)
    public void testsetBackbutton() throws Exception {
        toolbar.setBackbutton();
    }


}