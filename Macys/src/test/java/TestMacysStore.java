import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMacysStore extends MobileAPI {

    MacysStores macysStores;

    @BeforeMethod
    public void initialize(){
        this.macysStores = PageFactory.initElements(this.ad, MacysStores.class);
        macysStores.clickStore();
    }

//    @Test (priority = 1)
//    public void testStoreHeading(){
//        macysStores.storeHeadingDisplay();
//    }
//
//    @Test (priority = 2)
//    public void testClickSelectAStore(){
//        macysStores.clickSelectAStore();
//    }
//
//    @Test (priority = 3)
//    public void testClickStoreNearMe() throws Exception{
//        macysStores.clickStoreNearMe();
//    }
//
//    @Test (priority = 4)
//    public void testSearchForStore() throws Exception{
//        macysStores.searchForStore();
//    }
//
//    @Test (priority = 5)
//    public void testSelectHeraldSquare() throws Exception{
//        macysStores.selectHeraldSquare();
//    }
//
//    @Test (priority = 6)
//    public void testCheckMaps() throws Exception{
//        macysStores.checkMaps();
//    }
//
//    @Test (priority = 7)
//    public void testInvalidSearch() throws Exception{
//        macysStores.invalidSearch();
//    }

    @Test (priority = 8)
    public void testSearchDirectory() throws Exception{
        macysStores.searchDirectory();
    }
}
