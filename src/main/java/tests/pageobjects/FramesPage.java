package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;

public class FramesPage extends WebPageObject {
    //CheckBoxes page element

    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.NESTEDFRAMES);
    }


    public iFramePage getiFramePage() {
        augmented().findElementClickable(Bys.IFRAME).click();
        return get(iFramePage.class);
    }


    //TODO - public NestedFramePage getiNestedFramePage() {  } : currently irrelevant


    public static class Bys {
        public static final By IFRAME = By.xpath("//a[@href = '/iframe']");
        public static final By NESTEDFRAMES = By.xpath("//a[@href = '/nested_frames']");


    }
}
