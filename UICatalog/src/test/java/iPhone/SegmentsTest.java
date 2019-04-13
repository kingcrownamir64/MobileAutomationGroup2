package iPhone;

import SegmentsPage.Segments;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegmentsTest extends MobileAPI {

    Segments segments;

    @BeforeMethod
    public void initialize(){
        this.segments = PageFactory.initElements(this.ad, Segments.class);
        segments.clickSegments();
    }

    @Test (priority = 1)
    public void testClickCheck(){
        segments.clickCheck();
    }

    @Test (priority = 2)
    public void testClickSearch(){
        segments.clickSearch();
    }

    @Test (priority = 3)
    public void testClickTools(){
        segments.clickTools();
    }

    @Test (priority = 4)
    public void testClickBorderedCheck(){
        segments.clickBorderedCheck();
    }

    @Test (priority = 5)
    public void testClickBorderedSearch(){
        segments.clickBorderedSearch();
    }

    @Test (priority = 6)
    public void testClickBorderedTools(){
        segments.clickBorderedTools();
    }

    @Test (priority = 7)
    public void testClickStyleBarCheck(){
        segments.clickStyleBarCheck();
    }

    @Test (priority = 8)
    public void testClickStyleBarSearch(){
        segments.clickStyleBarSearch();
    }

    @Test (priority = 9)
    public void testClickStyleBarTools(){
        segments.clickStyleBarTools();
    }

    @Test (priority = 10)
    public void testClickTintCheck(){
        segments.clickTintCheck();
    }

    @Test (priority = 11)
    public void testClickTintSearch(){
        segments.clickTintSearch();
    }

    @Test (priority = 12)
    public void testClickTintTools(){
        segments.clickTintTools();
    }

    @Test (priority = 13)
    public void testClickImageCheck(){
        segments.clickImageCheck();
    }

    @Test (priority = 14)
    public void testClickImageSearch(){
        segments.clickImageSearch();
    }

    @Test (priority = 15)
    public void testClickImageTools(){
        segments.clickImageTools();
    }
}