import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDunkinDonutsHome extends MobileAPI {

    DunkinDonutsHome dunkinDonutsHome;

    @BeforeMethod
    public void initialize(){
        this.dunkinDonutsHome = PageFactory.initElements(this.ad, DunkinDonutsHome.class);
        dunkinDonutsHome.acceptPopUps();
    }

    @Test (priority = 1)
    public void testDDPerksLogo(){
        dunkinDonutsHome.verifyDDPerksLogo();
    }

    @Test (priority = 2)
    public void testVerifyAdd(){
        dunkinDonutsHome.verifyAdd();
    }

    @Test (priority = 3)
    public void testVerifyScanPay(){
        dunkinDonutsHome.verifyScanPay();
    }

    @Test (priority = 4)
    public void testVerifyOrder(){
        dunkinDonutsHome.verifyOrder();
    }

    @Test (priority = 5)
    public void testVerifyOrderTile(){
        dunkinDonutsHome.verifyOrderTile();
    }

    @Test (priority = 6)
    public void verifyDDPerks(){
        dunkinDonutsHome.verifyJoinDDPerks();
    }

    @Test (priority = 7)
    public void testVerifyAddDDCard(){
        dunkinDonutsHome.verifyAddDDCard();
    }
}
