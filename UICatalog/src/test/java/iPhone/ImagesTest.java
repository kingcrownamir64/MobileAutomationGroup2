package iPhone;

import ButtonsPage.Buttons;
import ImgesPage.Images;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTest extends MobileAPI {

    Images images;

    @BeforeMethod
    public void initialize(){
        this.images = PageFactory.initElements(this.ad, Images.class);
        images.clickImages();
    }

    @Test
    public void testDragDuration() throws Exception{
        images.dragDuration();
    }

}