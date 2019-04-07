package iPhone;

import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 * MODIFIED BY NABIL
 */
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
}
