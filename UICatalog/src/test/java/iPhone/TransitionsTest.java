package iPhone;

import TransitionsPage.Transitions;
import WebPage.Web;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransitionsTest extends MobileAPI {

    Transitions transitions;

    @BeforeMethod
    public void initialize(){
        this.transitions = PageFactory.initElements(this.ad, Transitions.class);
        transitions.clickTransitions();
    }

    @Test (priority = 1)
    public void testFlipImage(){
        transitions.verifyFlipImage();
    }

    @Test (priority = 2)
    public void testCurlImage(){
        transitions.verifyCurlImage();
    }
}