package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;


public class mainPage extends WebPageObject  {

    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.HEADING);
    }

    public CheckBoxesPage getCheckBoxesPage() {
        augmented().findElementClickable(Bys.CHECKBOXES).click();
        return get(CheckBoxesPage.class);
    }

    public FramesPage getFramesPage() {
        augmented().findElementClickable(Bys.FRAMES).click();
        return get(FramesPage.class);
    }

    public DynamicLoadingPage getDynamicLoadingPage() {
        augmented().findElementClickable(Bys.DYNAMICLOADING).click();
        return get(DynamicLoadingPage.class);
    }

    private static class Bys {
        private static final By HEADING = By.id("content");
        private static final By LOGIN = By.xpath("//a[@href = '/basic_auth']");
        private static final By CHECKBOXES = By.xpath("//a[@href = '/Checkboxes']");
        private static final By FRAMES = By.xpath("//a[@href = '/Frames']");
        private static final By DYNAMICLOADING = By.xpath("//a[@href = '/dynamic_loading']");


    }

}
