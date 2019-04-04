package testHome;

import common.MobileAPI;
import datasource.MySqlData;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

import static datasource.MySqlData.convertToString;

public class TestMainPage extends MobileAPI{
    MySqlData mySqlData;
MainPage mainPage;

    @BeforeMethod
    public void initialize() throws Exception {
        this.mainPage = PageFactory.initElements(this.ad, MainPage.class);
        Thread.sleep(1000);
        mySqlData = new MySqlData();
    }


//    @Test(priority = 1)
//    public void testMenu() throws Exception {
//        mainPage.setClickMenu();
//    }
//
//    @Test(priority = 2)
//    public void testSellingButton() throws Exception {
//        mainPage.setClickSellingButton();
//    }
//
//    @Test(priority = 3)
//    public void testDealsButton() throws Exception {
//        mainPage.setClickDealsButton();
//    }
//
//    @Test(priority = 4)
//    public void testCategoriesButton() throws Exception {
//        mainPage.setClickCategoriesButton();
//    }
//
//    @Test(priority = 5)
//    public void testSavedButton() throws Exception {
//        mainPage.setClickSavedButton();
//    }

//    @Test(priority = 6)
//    public void testRegistrationButton() throws Exception {
//        mainPage.setClickRegisterButton();
//    }

//    @Test(priority = 7)
//    public void testSignInButton() throws Exception {
//        mainPage.setClickSignInButton();
//    }

//    @Test(priority = 8)
//    public void testEbayLogo() throws Exception {
//        mainPage.setEbayLogo();
//    }

//    @Test(priority = 9)
//    public void testSeeDetailsButton() throws Exception {
//        mainPage.setDetailsButton();
//    }

    //DATABASE IMPLEMENTED
    @Test
    public void testSearchBarUsingDatabase() throws Exception {
        mainPage.setSearchBoxButton();
        List<String> list = null;
        try {
            list = mySqlData.getItemsListFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String s : list) {
            mainPage.searchForItems(s);
        }
    }

}
