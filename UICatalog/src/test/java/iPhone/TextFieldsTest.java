package iPhone;

import TextFieldsPage.TextFields;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextFieldsTest extends MobileAPI {


    TextFields textfield = new TextFields();

    @BeforeMethod
    public void initialize(){
        this.textfield = PageFactory.initElements(this.ad, TextFields.class);
        textfield.setTextFieldsPageButton();
    }

    @Test(priority = 1)
    public void testUITextField() throws Exception {
        textfield.setUITextField();
    }

    @Test(priority = 2)
    public void testUITextFieldRound() throws Exception {
        textfield.setUITextFieldRound();
    }

    @Test(priority = 3)
    public void testUITextFieldSecure() throws Exception {
        textfield.setUITextFieldSecure();
    }

    @Test(priority = 4)
    public void testUITextFieldWithLeftView() throws Exception {
        textfield.setUITextFieldWithLeftView();
    }
}