import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDunkinDonutsSignUpPage extends MobileAPI {

    DunkinDonutsSignUpPage dunkinDonutsSignUpPage;

    @BeforeMethod
    public void initialize(){
        this.dunkinDonutsSignUpPage = PageFactory.initElements(this.ad, DunkinDonutsSignUpPage.class);
        dunkinDonutsSignUpPage.acceptPopUps();
    }

    @Test (priority = 1)
    public void testSignUpHeading(){
        dunkinDonutsSignUpPage.verifySignUpHeading();
    }
}
