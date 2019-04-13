package iPhone;

import WebPage.Web;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTest extends MobileAPI{

    Web web;

    @BeforeMethod
    public void initialize(){
        this.web = PageFactory.initElements(this.ad, Web.class);
        web.clickWeb();
    }

    @Test (priority = 1)
    public void testAppleLogo(){
        web.verifyAppleLogo();
    }

    @Test (priority = 2)
    public void testSignIn(){
        web.verifyShoppingBag();
    }

    @Test (priority = 3)
    public void testButtonBurger(){
        web.verifyButtonBurger();
    }

    @Test (priority = 4)
    public void testiPhoneXr(){
        web.iPhoneXr();
    }
}