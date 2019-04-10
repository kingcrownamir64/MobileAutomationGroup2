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

//    @Test (priority = 1)
//    public void testGrayButton() throws Exception{
//        buttons.clickGray();
//    }

    @Test (priority = 2)
    public void testButtonWithImage() throws Exception{
        buttons.clickBtnWithImg();
    }
}
