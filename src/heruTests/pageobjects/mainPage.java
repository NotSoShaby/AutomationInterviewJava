package heruTests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class mainPage extends Primary  {

    //Main page of the project.
    //Contains methods to return the relevant pageobjects

    By HEADING = By.id("content");
    By LOGIN = By.cssSelector("a[href='/basic_auth']");
    By CHECKBOXES = By.cssSelector("a[href='/checkboxes']");
    By FRAMES = By.cssSelector("a[href='/frames']");
    By DYNAMICLOADING = By.cssSelector("a[href='/dynamic_loading']");

    public mainPage(WebDriver driver) {
        super(driver);
        open("http://the-internet.herokuapp.com");
        waitForVisible(HEADING);
    }

    public CheckBoxesPage getCheckBoxesPage() {
        waitAndClick(CHECKBOXES);
        CheckBoxesPage CBpage = new CheckBoxesPage(this.driver);
        return CBpage;
    }

    public DynamicLoadingPage getDynamicLoadingPage() {
        waitAndClick(DYNAMICLOADING);
        DynamicLoadingPage DLpage = new DynamicLoadingPage(this.driver);
        return DLpage;
    }

    public FramesPage getFramesPage() {
        waitAndClick(FRAMES);
        FramesPage Fpage = new FramesPage(this.driver);
        return Fpage;
    }
    //TODO- complete LoginPage
    /*public LoginPage LoginPage() {
        waitAndClick(Bys.CHECKBOXES);
        LoginPage page = new LoginPage();
        return page;
    }*/

}

