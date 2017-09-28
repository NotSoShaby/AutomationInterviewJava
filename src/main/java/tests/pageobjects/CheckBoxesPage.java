package main.java.tests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import java.util.Optional;
import org.openqa.selenium.By;

public class CheckBoxesPage extends WebPageObject {
    //CheckBoxes page element

    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.CHECKBOXESWAITEL);
    }

    //TODO - make a mechanism to run on a list of all the checkboxes elements in the page

    public void clickCheckBox1() { augmented().findElementClickable(Bys.CHECKBOX1).click(); }

    public void clickCheckBox2() { augmented().findElementClickable(Bys.CHECKBOX2).click(); }

    public Boolean checkIfCB1IsSelected() { return driver().findElement(Bys.CHECKBOX1).isSelected(); }

    public Boolean checkIfCB2IsSelected() { return driver().findElement(Bys.CHECKBOX2).isSelected(); }


    public static class Bys {
        public static final By CHECKBOXESWAITEL = By.id("checkboxes");
        public static final By CHECKBOX1 = By.xpath("//input[@type = 'checkbox'][0]");
        public static final By CHECKBOX2 = By.xpath("//input[@type = 'checkbox'][1]");


    }
}
