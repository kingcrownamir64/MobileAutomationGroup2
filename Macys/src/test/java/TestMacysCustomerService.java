import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMacysCustomerService extends MobileAPI {

    MacysCustomerService macysCustomerService;

    @BeforeMethod
    public void initialize(){
        this.macysCustomerService = PageFactory.initElements(this.ad, MacysCustomerService.class);
        macysCustomerService.clickCustomerService();
    }

    @Test (priority = 1)
    public void testHelpHeading(){
        macysCustomerService.verifyHelpHeading();
    }

    @Test (priority = 2)
    public void testChangePW() throws Exception{
        macysCustomerService.verifyChangePassword();
    }

    @Test (priority = 3)
    public void testMakeCCPayment() throws Exception{
        macysCustomerService.verifyMakeCCPayment();
    }

    @Test (priority = 4)
    public void testUsePromoCode() throws Exception{
        macysCustomerService.verifyUsingPromoCodes();
    }

    @Test (priority = 5)
    public void testTrackOrder() throws Exception{
        macysCustomerService.verifyTrackingOrder();
    }

    @Test (priority = 6)
    public void testUsingGooglePay() throws Exception{
        macysCustomerService.verifyUseGooglePay();
    }

    @Test (priority = 7)
    public void testEmail() throws Exception{
        macysCustomerService.verifyEmail();
    }

    @Test (priority = 8)
    public void testFeedback() throws Exception{
        macysCustomerService.verifyFeedback();
    }

    @Test (priority = 9)
    public void testCall() throws Exception{
        macysCustomerService.verifyCall();
    }

    @Test (priority = 10)
    public void testPrivacyPractices() throws Exception{
        macysCustomerService.verifyPrivacyPractices();
    }
}
