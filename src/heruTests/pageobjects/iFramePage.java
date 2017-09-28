package heruTests.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Optional;

public class iFramePage extends Primary {
    //CheckBoxes page element

    private static final By IFRAMEWAITEL = By.id("mceu_14-body");
    private static final By IFRAMEID = By.id("mce_0_ifr");
    private static final By BOXID = By.id("tinymce");


    public iFramePage(WebDriver driver){
        super(driver);
        waitForVisible(IFRAMEWAITEL);
    }

    public void InsertText(String txt){
        //Inserts text to the iframe and insures that the text was entered
        driver.switchTo().frame(driver.findElement(IFRAMEID));
        WebElement inputBox = find(BOXID);
        inputBox.clear();
        inputBox.sendKeys(txt);

    }

    public String getTextFromiFrame(){
        WebElement inputBox = find(BOXID);
        return inputBox.getText();
    }



    public static class Bys {
        public static final By IFRAMEWAITEL = By.id("mceu_14-body");
        public static final By IFRAMEID = By.id("mce_0_ifr");
        public static final By IFRAMEREADINGID = By.id("tinymce");



    }
}
