package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;

public class RenderedElementPage extends WebPageObject {
    //CheckBoxes page element

    @Override
    public Optional<By> visibleBy() { return Optional.of(Bys.START); }


    public void Start() { augmented().findElementClickable(Bys.START).click(); }

    public void WaitForProcessTofinish() {
        try { augmented().findElementVisibleAfter(Bys.FINISHED, 50); }
        catch(Exception e) { System.err.println(e); }
    }

    public Boolean isLoaderVisible() { return driver().findElement(Bys.LOADER).isDisplayed(); }

    public Boolean isFinishMessageVisible() { return driver().findElement(Bys.FINISHED).isDisplayed(); }


    //TODO - public HiddenElementPage getiHidddenElementPage() {  } : currently irrelevant


    public static class Bys {
        public static final By START = By.id("start");
        public static final By LOADER = By.id("loading");
        public static final By FINISHED = By.id("finish");


    }
}
