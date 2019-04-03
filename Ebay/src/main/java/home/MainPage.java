package home;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    public WebElement btnBurger;

    public void getMenu() throws Exception {
        btnBurger.click();
        Thread.sleep(4000);
    }


}
