package heruTests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class FramesPage extends Primary {
    //CheckBoxes page element

    private static final By IFRAME = By.xpath("//a[@href = '/iframe']");
    private static final By NESTEDFRAMES = By.xpath("//a[@href = '/nested_frames']");


    public FramesPage(WebDriver driver){
        super(driver);
        waitForVisible(IFRAME);
    }


    public iFramePage getiFramePage() {
        waitAndClick(IFRAME);
        iFramePage page = new iFramePage(this.driver);
        return page;
    }


    //TODO - public NestedFramePage getiNestedFramePage() {  } : currently irrelevant

}
