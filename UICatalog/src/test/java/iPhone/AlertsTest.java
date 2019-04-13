package iPhone;

import AlertsPage.Alerts;
import TextFieldsPage.TextFields;
import ToolbarPage.Toolbar;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends MobileAPI{


    Alerts alerts = new Alerts();

    @BeforeMethod
    public void initialize() throws Exception {
        this.alerts = PageFactory.initElements(this.ad, Alerts.class);
        alerts.setSelectAlertsPage();
    }

    @Test(priority = 1)
    public void testShowSimpleButton() throws Exception {
        alerts.setShowSimpleButton();
    }

    @Test(priority = 2)
    public void testShowOkCancelButton() throws Exception {
        alerts.setShowOkCancelButton();
    }

    @Test(priority = 3)
    public void testShowCustomized() throws Exception {
        alerts.setShowCustomized();
    }

    @Test(priority = 4)
    public void testShowSimple() throws Exception {
        alerts.setShowSimple();
    }


}