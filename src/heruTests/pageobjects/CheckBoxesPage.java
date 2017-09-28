package heruTests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;


public class CheckBoxesPage extends Primary {
    //CheckBoxes page element

    private static final By CHECKBOXESWAITEL = By.id("checkboxes");;
    private static final By CHECKBOXES = By.cssSelector("input[type='checkbox']");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        waitForVisible(CHECKBOXESWAITEL);
    }

    //TODO - make a mechanism to run on a list of all the checkboxes elements in the page

    List<WebElement> CheckBoxes = driver.findElements(CHECKBOXES);

    public void clickCheckBox(int CheckBoxNumber) {
        waitForVisible(CHECKBOXES);
        CheckBoxes.get(CheckBoxNumber).click();
    }


    public Boolean checkIfCBIsSelected(int CheckBoxNumber) {
        return CheckBoxes.get(CheckBoxNumber).isSelected();
    }


}
