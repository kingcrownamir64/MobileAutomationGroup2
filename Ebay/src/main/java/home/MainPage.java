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

    @FindBy(xpath = "    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView\n")
    public WebElement NotificationButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]\n")
    public WebElement SellingButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]\n")
    public WebElement DealsButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]\n")
    public WebElement CategoriesButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]\n")
    public WebElement SavedButton;

//    @FindBy(xpath = "")
//    public WebElement DealsButton;
//
//    @FindBy(xpath = "")
//    public WebElement DealsButton;



    public void ClickMenu() throws Exception {
        btnBurger.click();
        Thread.sleep(4000);
    }

    public void ClickSellingButton() throws Exception {
        Assert.assertTrue(SellingButton.getText().contains("SELLING"));
        SellingButton.click();
        Thread.sleep(4000);
    }

    public void ClickDealsButton() throws Exception {
        Assert.assertTrue(DealsButton.getText().contains("DEALS"));
        DealsButton.click();
        Thread.sleep(4000);
    }

    public void ClickSavedButton() throws Exception {
        Assert.assertTrue(SavedButton.getText().contains("SAVED"));
        SavedButton.click();
        Thread.sleep(4000);
    }

    public void ClickCategoriesButton() throws Exception {
        Assert.assertTrue(CategoriesButton.getText().contains("CATEGORIES"));
        CategoriesButton.click();
        Thread.sleep(4000);
    }

}
