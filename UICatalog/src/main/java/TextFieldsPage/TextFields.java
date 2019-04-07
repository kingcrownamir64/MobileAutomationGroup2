package TextFieldsPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFields extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]\n")
    public WebElement UITextField;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Rounded\"]\n")
    public WebElement UITextFieldRound;

    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Secure\"]\n")
    public WebElement UITextFieldSecure;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Check\"]\n")
    public WebElement UITextFieldWithLeftView;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]\n")
    public WebElement TextFieldsPageButton;


    public void setUITextField() throws Exception {
        UITextField.click();
        UITextField.clear();
        Thread.sleep(2000);
        UITextField.sendKeys("Testing 123");
    }

    public void setUITextFieldRound() throws Exception {
        UITextFieldRound.sendKeys("Testing 123");
    }

    public void setUITextFieldSecure() throws Exception {
        UITextFieldSecure.sendKeys("Testing 123");
    }

    public void setUITextFieldWithLeftView() throws Exception {
        UITextFieldWithLeftView.sendKeys("Testing 123");
    }

    public void setTextFieldsPageButton(){
        TextFieldsPageButton.click();
    }

}