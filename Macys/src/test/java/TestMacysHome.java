import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMacysHome extends MobileAPI {

    MacysHome macysHome;

    @BeforeMethod
    public void initialize() throws Exception{
        this.macysHome = PageFactory.initElements(this.ad, MacysHome.class);
    }

    @Test(priority = 1)
    public void testArticles() throws Exception {
        macysHome.clickShop();
    }

    @Test (priority = 2)
    public void testVerifyShopHead() throws Exception{
        macysHome.verifyShop();
    }

    @Test (priority = 3)
    public void testClickWomens() throws Exception{
        macysHome.clickWomens();
    }

    @Test (priority = 4)
    public void testClickMens() throws Exception{
        macysHome.clickMens();
    }

    @Test (priority = 5)
    public void testClickKids() throws Exception{
        macysHome.clickKids();
    }

    @Test (priority = 6)
    public void testClickHome() throws Exception{
        macysHome.clickHome();
    }

    @Test (priority = 7)
    public void testClickShoes() throws Exception{
        macysHome.clickShoes();
    }

    @Test (priority = 8)
    public void testClickHandbags() throws Exception{
        macysHome.clickHandbags();
    }

    @Test (priority = 9)
    public void testClickBeauty() throws Exception{
        macysHome.clickBeauty();
    }

    @Test (priority = 10)
    public void testClickFurniture() throws Exception{
        macysHome.clickFurniture();
    }

    @Test (priority = 11)
    public void testClickBedBath() throws Exception{
        macysHome.clickBedBath();
    }

    @Test (priority = 12)
    public void testClickJewelry() throws Exception{
        macysHome.clickJewelry();
    }

    @Test (priority = 13)
    public void testClickWatches() throws Exception{
        macysHome.clickWatches();
    }

    @Test (priority = 14)
    public void testClickJuniors() throws Exception{
        macysHome.clickJuniors();
    }

    @Test (priority = 15)
    public void testClickPlusAndPetite() throws Exception{
        macysHome.clickPlusAndPetite();
    }

    @Test (priority = 16)
    public void testClickBaby() throws Exception{
        macysHome.clickBaby();
    }

    @Test (priority = 17)
    public void testClickSportsFanShop() throws Exception{
        macysHome.clickSportsFanShop();
    }

    @Test (priority = 18)
    public void testClickTheEdit() throws Exception{
        macysHome.clickTheEdit();
    }

    @Test (priority = 19)
    public void testClickGiftGuide() throws Exception{
        macysHome.clickGiftGuide();
    }

    @Test (priority = 20)
    public void testClickWeddingRegistry() throws Exception{
        macysHome.clickWeddingRegistry();
    }

    @Test (priority = 21)
    public void testClickSales() throws Exception{
        macysHome.clickSales();
    }
}