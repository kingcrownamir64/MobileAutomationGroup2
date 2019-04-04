package home;

import common.MobileAPI;
import datasource.MySqlData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static datasource.MySqlData.convertToString;

public class MainPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    public WebElement btnBurger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView\n")
    public WebElement NotificationButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]\n")
    public WebElement SellingButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]\n")
    public WebElement DealsButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]\n")
    public WebElement CategoriesButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]\n")
    public WebElement SavedButton;

    @FindBy(id = "com.ebay.mobile:id/button_register")
    public WebElement RegisterButton;

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    public WebElement SignInButton;

    @FindBy(id = "com.ebay.mobile:id/logo")
    public WebElement EbayLogo;

    @FindBy(id = "com.ebay.mobile:id/ad_call_to_action")
    public WebElement SeeDetailsButton;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    public WebElement SearchBoxButton;

    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    public WebElement SearchBox;





    public void setClickMenu() throws Exception {
        btnBurger.click();
        Thread.sleep(1000);
    }

    public void setClickSellingButton() throws Exception {
        Assert.assertTrue(SellingButton.getText().contains("SELLING"));
        SellingButton.click();
        Thread.sleep(1000);
    }

    public void setClickDealsButton() throws Exception {
        Assert.assertTrue(DealsButton.getText().contains("DEALS"));
        DealsButton.click();
        Thread.sleep(1000);
    }

    public void setClickSavedButton() throws Exception {
        Assert.assertTrue(SavedButton.getText().contains("SAVED"));
        SavedButton.click();
        Thread.sleep(1000);
    }

    public void setClickCategoriesButton() throws Exception {
        Assert.assertTrue(CategoriesButton.getText().contains("CATEGORIES"));
        CategoriesButton.click();
        Thread.sleep(1000);
    }

    public void setClickRegisterButton() throws Exception {
        Assert.assertTrue(RegisterButton.getText().contains("REGISTER"));
        RegisterButton.click();
        Thread.sleep(1000);
    }

    public void setClickSignInButton() throws Exception {
        Assert.assertTrue(SignInButton.getText().contains("SIGN IN"));
        SignInButton.click();
        Thread.sleep(1000);
    }

    public void setEbayLogo() throws Exception {
        EbayLogo.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    public void setDetailsButton() throws Exception {
        Assert.assertTrue(SeeDetailsButton.getText().contains("SEE DETAILS."));
        ad.scrollTo("com.ebay.mobile:id/ad_call_to_action").click();
        SeeDetailsButton.click();
        Thread.sleep(1000);
    }
    public void searchForItems(String item) throws Exception {
        SearchBox.clear();
        Thread.sleep(2000);
        SearchBox.sendKeys(item);
        Thread.sleep(2000);
    }
    public void setSearchBoxButton() throws Exception {
        SearchBoxButton.click();
        Thread.sleep(4000);
    }
}
