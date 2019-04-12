import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDunkinDonutsSignUpPage extends MobileAPI {

    DunkinDonutsSignUpPage dunkinDonutsSignUpPage;

    @BeforeMethod
    public void initialize(){
        this.dunkinDonutsSignUpPage = PageFactory.initElements(this.ad, DunkinDonutsSignUpPage.class);
        dunkinDonutsSignUpPage.acceptPopUps();
    }

    @Test (priority = 1)
    public void testSignUpHeading(){
        dunkinDonutsSignUpPage.verifySignUpHeading();
    }

    @Test (priority = 2)
    public void testFirstName() throws Exception{
        dunkinDonutsSignUpPage.enterFirstName();
    }

    @Test (priority = 3)
    public void testEnterFirstLastName() throws Exception{
        dunkinDonutsSignUpPage.enterFirstLastName();
    }

    @Test (priority = 4)
    public void testInvalidEmail() throws Exception{
        dunkinDonutsSignUpPage.verifyInvalidEmail();
    }

    @Test (priority = 5)
    public void testInvalidPhone() throws Exception{
        dunkinDonutsSignUpPage.verifyInvalidPhone();
    }

    @Test (priority = 6)
    public void testInvalidPassword() throws Exception{
        dunkinDonutsSignUpPage.verifyInvalidPassword();
    }

    @Test (priority = 7)
    public void testPasswordNotMatching() throws Exception{
        dunkinDonutsSignUpPage.passwordNotMatching();
    }

    @Test (priority = 8)
    public void testInvalidZipCode() throws Exception{
        dunkinDonutsSignUpPage.verifyInvalidZipCode();
    }

    @Test (priority = 9)
    public void testZipCodeDeleteButton(){
        dunkinDonutsSignUpPage.verifyZipCodeDeleteButton();
    }

    @Test (priority = 10)
    public void testPromoCodeMessage() throws Exception{
        dunkinDonutsSignUpPage.verifyPromoCodeQuestion();
    }

    @Test (priority = 11)
    public void testAgree(){
        dunkinDonutsSignUpPage.verifyAgree();
    }
}
