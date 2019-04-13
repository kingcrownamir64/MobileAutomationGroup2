package iPhone;

import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest extends MobileAPI {

    Buttons buttons;

    @BeforeMethod
    public void initialize(){
        this.buttons = PageFactory.initElements(this.ad, Buttons.class);
        buttons.clickButtons();
    }

    @Test (priority = 1)
    public void testGrayButton() throws Exception{
        buttons.clickGray();
    }

    @Test (priority = 2)
    public void testButtonWithImage() throws Exception{
        buttons.clickBtnWithImg();
    }

    @Test (priority = 3)
    public void testRoundedButton() throws Exception{
        buttons.clickRoundedButton();
    }

    @Test (priority = 4)
    public void testAttributedButton() throws Exception{
        buttons.clickAttributedButton();
    }

    @Test (priority = 5)
    public void testDetailsDisclosure(){
        buttons.clickDetailsDisclosure();
    }

    @Test (priority = 6)
    public void testInfoLight(){
        buttons.clickInfoLight();
    }

    @Test (priority = 7)
    public void testInfoDark(){
        buttons.clickInfoDark();
    }

    @Test (priority = 8)
    public void testContactAdd(){
        buttons.clickContactAdd();
    }
}