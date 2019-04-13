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

public class SettingsPage extends MobileAPI {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout\n")
    public WebElement NotoficationsButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout\n")
    public WebElement CountryRegionButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]\n")
    public WebElement ClearSearcgHistoryButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]\n")
    public WebElement GiftCardBalanceButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout\n")
    public WebElement MoneyBackGuaranteeButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]\n")
    public WebElement UserAgreementButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]\n")
    public WebElement PrivacyButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[8]\n")
    public WebElement AdvertisingOptOutButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[9]\n")
    public WebElement AdvertisingButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[10]\n")
    public WebElement CustomerServiceButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[11]\n")
    public WebElement ShareScreenButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[12]/android.widget.RelativeLayout\n")
    public WebElement AboutButton;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView\n")
    public WebElement SettingsLogo;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    public WebElement BurgerButton;

    @FindBy(id = "com.ebay.mobile:id/menuitem_settings")
    public WebElement SettingsButton;


    public void setNotoficationsButton() throws Exception {
        NotoficationsButton.click();
        Assert.assertTrue(true);
    }

    public void setCountryRegionButton() throws Exception {
        CountryRegionButton.click();
        Assert.assertTrue(true);
    }

    public void setClearSearcgHistoryButton() throws Exception {
        ClearSearcgHistoryButton.click();
        Assert.assertTrue(true);
    }

    public void setGiftCardBalanceButton() throws Exception {
        GiftCardBalanceButton.click();
        Assert.assertTrue(true);
    }

    public void setMoneyBackGuaranteeButton() throws Exception {
        MoneyBackGuaranteeButton.click();
        Assert.assertTrue(true);
    }

    public void setUserAgreementButton() throws Exception {
        UserAgreementButton.click();
        Assert.assertTrue(true);
    }

    public void setPrivacyButton() throws Exception {
        PrivacyButton.click();
        Assert.assertTrue(true);
    }

    public void setAdvertisingOptOutButton() throws Exception {
        AdvertisingOptOutButton.click();
        Assert.assertTrue(true);
    }

    public void setAdvertisingButton() throws Exception {
        AdvertisingButton.click();
        Assert.assertTrue(true);
    }

    public void setCustomerServiceButton() throws Exception {
        CustomerServiceButton.click();
        Assert.assertTrue(true);
    }

    public void setShareScreenButton() throws Exception {
        ShareScreenButton.click();
        Assert.assertTrue(true);
    }

    public void setAboutButton() throws Exception {
        AboutButton.click();
        Assert.assertTrue(true);
    }

    public void setSettingsLogo() throws Exception {
        SettingsLogo.click();
        Assert.assertTrue(true);
    }

    public void setBurgerButton() throws Exception {
        BurgerButton.click();
        Assert.assertTrue(true);
    }

    public void setSettingsButton() throws Exception {
        SettingsButton.click();
        Assert.assertTrue(true);
    }
}
