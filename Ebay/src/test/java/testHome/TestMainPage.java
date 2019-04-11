package testHome;

import common.MobileAPI;
import datasource.MySqlData;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

import java.util.List;

import static datasource.MySqlData.convertToString;

public class TestMainPage extends MobileAPI{
    MySqlData mySqlData;
    MainPage mainPage;

    DataReader excelData = new DataReader();
    String path ="/Users/amir/Desktop/MobileAutomationGroup2/Ebay/src/test/resources/ExcelFile.xls";


    @BeforeMethod
    public void initialize() throws Exception {
        this.mainPage = PageFactory.initElements(this.ad, MainPage.class);
        Thread.sleep(1000);
        mySqlData = new MySqlData();
    }


    @Test(priority = 1)
    public void testMenu() throws Exception {
        mainPage.setClickMenu();
    }

    @Test(priority = 2)
    public void testSellingButton() throws Exception {
        mainPage.setClickSellingButton();
    }

    @Test(priority = 3)
    public void testDealsButton() throws Exception {
        mainPage.setClickDealsButton();
    }

    @Test(priority = 4)
    public void testCategoriesButton() throws Exception {
        mainPage.setClickCategoriesButton();
    }

    @Test(priority = 5)
    public void testSavedButton() throws Exception {
        mainPage.setClickSavedButton();
    }

    @Test(priority = 6)
    public void testRegistrationButton() throws Exception {
        mainPage.setClickRegisterButton();
    }

    @Test(priority = 7)
    public void testSignInButton() throws Exception {
        mainPage.setClickSignInButton();
    }

    @Test(priority = 8)
    public void testEbayLogo() throws Exception {
        mainPage.setEbayLogo();
    }

    @Test(priority = 9)
    public void testSeeDetailsButton() throws Exception {
        mainPage.setDetailsButton();
    }

//    DATABASE IMPLEMENTED
    @Test(priority = 10)
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

//    KEYWORD DRIVEN TEST
    @Test(priority = 11)
    public void testSearchAndNavigateUsingKeywordDriven() throws Exception {
        String[] testSteps = excelData.fileReader3(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "search":
                    testMenu();
                    break;
                case "navigate":
                    testSellingButton();
                    break;
                default:
                    throw new Exception("Invalid choice");
            }
            System.out.println(str);
        }
    }

    @Test(priority = 12)
    public void testMenuHomeButton() throws Exception {
        mainPage.setMenuHomeButton();
    }

    @Test(priority = 13)
    public void testMenuNotificationsButton() throws Exception {
        mainPage.setMenuNotificationsButton();
    }

    @Test(priority = 14)
    public void testMenuMessagesButton() throws Exception {
        mainPage.setMenuMessagesButton();
    }

    @Test(priority = 15)
    public void testMenuWatchingButton() throws Exception {
        mainPage.setMenuWatchingButton();
    }

    @Test(priority = 16)
    public void testMenuSavedButton() throws Exception {
        mainPage.setMenuSavedButton2();
    }

    @Test(priority = 17)
    public void testMenuPurchasesButton() throws Exception {
        mainPage.setMenuPurchasesButton();
    }

    @Test(priority = 18)
    public void testMenuBid_OffersButton() throws Exception {
        mainPage.setMenuBids_OffersButton();
    }

    @Test(priority = 19)
    public void testMenuSellingButton() throws Exception {
        mainPage.setMenuSellingButton();
    }

    @Test(priority = 20)
    public void testMenuCategoriesButton() throws Exception {
        mainPage.setMenuCategoriesButton();
    }

    @Test(priority = 21)
    public void testMenuDealsButton() throws Exception {
        mainPage.setMenuDealsButton();
    }

    @Test(priority = 22)
    public void testMenuSettingButton() throws Exception {
        mainPage.setMenuSettingButton();
    }

    @Test(priority = 23)
    public void testMenuHelpButton() throws Exception {
        mainPage.setMenuHelpButton();
    }
}
