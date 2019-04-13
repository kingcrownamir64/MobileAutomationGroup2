package iPhone;

import ControlsPage.Controls;
import TextFieldsPage.TextFields;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends MobileAPI{


    Controls controls = new Controls();

    @BeforeMethod
    public void initialize() throws Exception {
        this.controls = PageFactory.initElements(this.ad, Controls.class);
        controls.setControlsPage();
    }

    @Test(priority = 2)
    public void testUITextField() throws Exception {
        controls.setStandardSwitch();
    }

    @Test(priority = 2)
    public void testSlider() throws Exception {
        controls.setSlider();
    }

    @Test(priority = 1)
    public void testCustomSlider() throws Exception {
        controls.setCustomSlider();
    }

}
