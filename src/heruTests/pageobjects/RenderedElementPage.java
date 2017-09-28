package heruTests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class RenderedElementPage extends Primary {
    //CheckBoxes page element

    private static final By START = By.xpath("//div[contains(@id, 'start')]//button");
    private static final By LOADER = By.id("loading");
    private static final By FINISHED = By.id("finish");

    public RenderedElementPage(WebDriver driver) {
        super(driver);
        waitForVisible(START);
    }


    public void pressStart() { waitAndClick(START); }

    public void WaitForProcessTofinish() {
        try { waitForVisibleDeclareTimeOut(FINISHED, 60); }
        catch(Exception e) { System.err.println(e); }
    }

    public Boolean isLoaderVisible() { return find(LOADER).isDisplayed(); }

    public Boolean isFinishMessageVisible() { return find(FINISHED).isDisplayed(); }


    //TODO - public HiddenElementPage getiHidddenElementPage() {  } : currently irrelevant

}
