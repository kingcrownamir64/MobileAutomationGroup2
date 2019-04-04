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

    @FindBy(id = "com.ebay.mobile:id/menu_search")
    public WebElement SearchButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_home")
    public WebElement HomeButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_notifications")
    public WebElement NotificationsButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_messages")
    public WebElement MessagesButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_watching")
    public WebElement WatchingButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_saved")
    public WebElement SavedButton2;

    @FindBy(id = "com.ebay.mobile:id/menuitem_purchases")
    public WebElement PurchaseButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_bids_offers")
    public WebElement Bids_OfferButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_selling")
    public WebElement SellingButton2;

    @FindBy(id = "com.ebay.mobile:id/menuitem_categories")
    public WebElement CategoriesButton2;

    @FindBy(id = "com.ebay.mobile:id/menuitem_deals")
    public WebElement DealsButton2;

    @FindBy(id = "com.ebay.mobile:id/menuitem_settings")
    public WebElement SettingButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_help_contact")
    public WebElement HelpButton;



    public void setSearchButton() throws Exception {
        SearchButton.click();
        Thread.sleep(1000);
    }

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
        SearchBox.sendKeys(item + "\n");
//        SearchBox.sendKeys(item);
        Thread.sleep(2000);
        SearchButton.click();
    }
    public void setSearchBoxButton() throws Exception {
        SearchBoxButton.click();
        Thread.sleep(4000);
    }

    public void setMenuHomeButton() throws Exception {
        btnBurger.click();
        Thread.sleep(4000);
        HomeButton.isDisplayed();
        Assert.assertTrue(true);
        HomeButton.click();
        Thread.sleep(1000);
    }

    public void setMenuNotificationsButton() throws Exception {
        btnBurger.click();
        NotificationsButton.isDisplayed();
        Assert.assertTrue(true);
        NotificationsButton.click();
        Thread.sleep(1000);
    }

    public void setMenuMessagesButton() throws Exception {
        btnBurger.click();
        MessagesButton.isDisplayed();
        Assert.assertTrue(true);
        MessagesButton.click();
        Thread.sleep(1000);
    }

    public void setMenuWatchingButton() throws Exception {
        btnBurger.click();
        WatchingButton.isDisplayed();
        Assert.assertTrue(true);
        WatchingButton.click();
        Thread.sleep(1000);
    }

    public void setMenuSavedButton2() throws Exception {
        btnBurger.click();
        SavedButton2.isDisplayed();
        Assert.assertTrue(true);
        SavedButton2.click();
        Thread.sleep(1000);
    }

    public void setMenuPurchasesButton() throws Exception {
        btnBurger.click();
        PurchaseButton.isDisplayed();
        Assert.assertTrue(true);
        PurchaseButton.click();
        Thread.sleep(1000);
    }

    public void setMenuBids_OffersButton() throws Exception {
        btnBurger.click();
        Bids_OfferButton.isDisplayed();
        Assert.assertTrue(true);
        Bids_OfferButton.click();
        Thread.sleep(1000);
    }

    public void setMenuSellingButton() throws Exception {
        btnBurger.click();
        SellingButton2.isDisplayed();
        Assert.assertTrue(true);
        SellingButton2.click();
        Thread.sleep(1000);
    }

    public void setMenuCategoriesButton() throws Exception {
        btnBurger.click();
        CategoriesButton2.isDisplayed();
        Assert.assertTrue(true);
        CategoriesButton2.click();
        Thread.sleep(1000);
    }

    public void setMenuDealsButton() throws Exception {
        btnBurger.click();
        DealsButton2.isDisplayed();
        Assert.assertTrue(true);
        DealsButton2.click();
        Thread.sleep(1000);
    }

    public void setMenuSettingButton() throws Exception {
        btnBurger.click();
        SettingButton.isDisplayed();
        Assert.assertTrue(true);
        SettingButton.click();
        Thread.sleep(1000);
    }

    public void setMenuHelpButton() throws Exception {
        btnBurger.click();
        HelpButton.isDisplayed();
        Assert.assertTrue(true);
        HelpButton.click();
        Thread.sleep(1000);
    }
}
