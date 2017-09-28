package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;

public class iFramePage extends WebPageObject {
    //CheckBoxes page element

    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.IFRAMEWAITEL);
    }

    public Boolean InsertTextAndInsureItsThere(String txt){
        //Inserts text to the iframe and insures that the text was entered

        augmented().findElementClickable(Bys.IFRAMEID).sendKeys(txt);
        return augmented().findElementVisible(Bys.IFRAMEREADINGID).getText().equals(txt);
    }



    public static class Bys {
        public static final By IFRAMEWAITEL = By.id("mceu_14-body");
        public static final By IFRAMEID = By.id("mce_0_ifr");
        public static final By IFRAMEREADINGID = By.id("tinymce");



    }
}
