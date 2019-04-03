package CategoriesTest;

import common.MobileAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MenuTest extends MobileAPI{

    @Test
    public void testArticles() throws Exception {
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.getMenu();
    }

}
