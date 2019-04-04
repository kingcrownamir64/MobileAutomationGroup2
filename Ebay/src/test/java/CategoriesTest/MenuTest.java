package CategoriesTest;

import common.MobileAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MenuTest extends MobileAPI{

    MainPage mainPage = PageFactory.initElements(ad, MainPage.class);


//    @Test(priority = 1)
    public void testMenu() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.ClickMenu();
    }

//    @Test(priority = 2)
    public void testSellingButton() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.ClickSellingButton();
    }

//    @Test(priority = 3)
    public void testDealsButton() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.ClickDealsButton();
    }

    @Test(priority = 4)
    public void testCategoriesButton() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.ClickCategoriesButton();
    }

//    @Test(priority = 5)
    public void testSavedButton() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.ClickSavedButton();
    }

}
