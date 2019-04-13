package iPhone;

import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import WebPage.Web;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PickerTest extends MobileAPI {

    Picker picker;

    @BeforeMethod
    public void initialize(){
        this.picker = PageFactory.initElements(this.ad, Picker.class);
        picker.clickPickers();
    }

    @Test (priority = 1)
    public void testScroll()throws Exception{
        picker.scroll();
    }

}