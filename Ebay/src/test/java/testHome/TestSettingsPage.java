package testHome;
import common.MobileAPI;
import home.SettingsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSettingsPage extends MobileAPI{


    SettingsPage settingsPage = new SettingsPage();

    @BeforeMethod
    public void initialize() throws Exception {
        this.settingsPage = PageFactory.initElements(this.ad, SettingsPage.class);
        settingsPage.setBurgerButton();
        Thread.sleep(4000);
        settingsPage.setSettingsButton();
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    public void testNotoficationsButton() throws Exception {
        settingsPage.setNotoficationsButton();
    }

    @Test(priority = 2)
    public void testCountryRegionButton() throws Exception {
        settingsPage.setCountryRegionButton();
    }

    @Test(priority = 3)
    public void testClearSearcgHistoryButton() throws Exception {
        settingsPage.setClearSearcgHistoryButton();
    }

    @Test(priority = 4)
    public void testGiftCardBalanceButton() throws Exception {
        settingsPage.setGiftCardBalanceButton();
    }

    @Test(priority = 5)
    public void testsetMoneyBackGuaranteeButton() throws Exception {
        settingsPage.setMoneyBackGuaranteeButton();
    }

    @Test(priority = 6)
    public void testUserAgreementButton() throws Exception {
        settingsPage.setUserAgreementButton();
    }

    @Test(priority = 7)
    public void testPrivacyButton() throws Exception {
        settingsPage.setPrivacyButton();
    }

    @Test(priority = 8)
    public void testAdvertisingOptOutButton() throws Exception {
        settingsPage.setAdvertisingOptOutButton();
    }

    @Test(priority = 9)
    public void testAdvertisingButton() throws Exception {
        settingsPage.setAdvertisingButton();
    }

    @Test(priority = 9)
    public void testCustomerServiceButton() throws Exception {
        settingsPage.setCustomerServiceButton();
    }

    @Test(priority = 9)
    public void testShareScreenButton() throws Exception {
        settingsPage.setShareScreenButton();
    }

    @Test(priority = 9)
    public void testAboutButton() throws Exception {
        settingsPage.setAboutButton();
    }

    @Test(priority = 9)
    public void testSettingsLogo() throws Exception {
        settingsPage.setSettingsLogo();
    }

    @Test(priority = 9)
    public void testBurgerButton() throws Exception {
        settingsPage.setBurgerButton();
    }

    @Test(priority = 9)
    public void testSettingsButton() throws Exception {
        settingsPage.setSettingsButton();
    }

}
