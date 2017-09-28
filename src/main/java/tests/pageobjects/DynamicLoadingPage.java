package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;

public class DynamicLoadingPage extends WebPageObject {
    //CheckBoxes page element

    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.PAGEFOOTERWAITEL);
    }


    public RenderedElementPage getRenderedElementPage() {
        augmented().findElementClickable(Bys.RENDEREDELEMENTBUTTON).click();
        return get(RenderedElementPage.class);
    }


    //TODO - public HiddenElementPage getiHidddenElementPage() {  } : currently irrelevant


    public static class Bys {
        public static final By PAGEFOOTERWAITEL = By.id("page-footer");
        public static final By RENDEREDELEMENTBUTTON = By.xpath("//a[@href = '/dynamic_loading/2']");
        public static final By HIDDENELEMENTBUTTON = By.xpath("//a[@href = '/dynamic_loading/1']");


    }
}
